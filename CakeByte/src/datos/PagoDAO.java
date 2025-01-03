package datos;

import database.Conexion;
import datos.Interfaces.CrudPago;
import entidades.pago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PagoDAO implements CrudPago<pago> {
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private int estadoIndex; // Índice que representa el estado actual
   
    public PagoDAO(){
        CON = Conexion.getinstancia();
    }

    @Override
    public List<pago> listar(String Texto) {
        List<pago> registros = new ArrayList(); 
                                                                                        
        try {                                      
            ps= CON.conectar().prepareStatement("SELECT pe.id_Pago, p.id_Pedido, pe.metodo_pago, pe.Monto, pe.Fecha_Pago, p.Fecha_Pedido, p.Fecha_Entrega, p.Estado, p.Instrucciones_Especiales, p.Total FROM tb_pago pe inner join tb_pedido p ON pe.id_pago = p.id_pedido WHERE pe.Fecha_Pago LIKE ? ORDER BY pe.id_Pago ASC LIMIT ?,?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new pago( rs.getDouble(1),rs.getDate(2)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps= null;
            rs=null;
            CON.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(pago obj) {
        resp= false;
        try {
            ps= CON.conectar().prepareStatement("INSERT INTO tb_pago (Metodo_Pago, Monto, Fecha_Pago) VALUES (?,?,?)");
            
            ps.setDouble(1, obj.getMonto());
            ps.setDate(2, new java.sql.Date(obj.getFechaPago().getTime()));
            ps.setString(3, obj.getMetodosPago()[estadoIndex]);
            
            if (ps.executeUpdate() > 0) {
                resp= true;
            }
            
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            ps= null;
            CON.desconectar();    
        }
        return resp;
    }

    @Override
    public boolean actualizar(pago obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_pago SET Metodo_Pago=?, Monto=?, Fecha_Pago=? WHERE ID_Pago=?");
            ps.setString(1, obj.getMetodosPago()[estadoIndex]);
            ps.setDouble(2, obj.getMonto());
            ps.setDate(3, new java.sql.Date(obj.getFechaPago().getTime()));
            ps.setInt(4, obj.getId_Pago());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public int total() {
        int totalRegistros = 0;
        try {
            ps = CON.conectar().prepareStatement("SELECT COUNT(ID_Pago) FROM tb_pago");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(ID_Pago)");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return totalRegistros;
    }

    @Override
    public boolean existencia(String existe) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT Fecha_Pago FROM tb_pago WHERE Fecha_Pago=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, existe);
            rs = ps.executeQuery();
            rs.last();
            if (rs.getRow() > 0) {
                resp = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return resp;
    }
}
