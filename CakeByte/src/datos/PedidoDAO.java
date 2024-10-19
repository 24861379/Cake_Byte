package datos;

import database.Conexion;
import datos.Interfaces.crudPedido;
import entidades.pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//import java.util.Date;

public class PedidoDAO implements crudPedido<pedido> {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp; 
   
    public PedidoDAO(){
        CON = Conexion.getinstancia();
    }
    
    @Override
    public List<pedido> listar(String Texto) {
        List<pedido> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM pedido WHERE nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new pedido(rs.getInt(1), rs.getDate(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getDouble(6)));
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
    public boolean insertar(pedido obj) {
        resp= false;
        try {
            ps= CON.conectar().prepareStatement("INSERT INTO pedido (Fecha_Pedido, Fecha_Entrega, Estado, Instrucciones_Especiales, Total) VALUES (?,?,?,?,?)");
            
            ps.setDate(1, new java.sql.Date(obj.getFechaPedido().getTime()));// Convertir a java.sql.Date
            ps.setDate(2, new java.sql.Date(obj.getFechaEntrega().getTime()));
            ps.setString(3, obj.getEstado());
            ps.setString(4, obj.getInstruccionesEspeciales());
            ps.setDouble(5, obj.getToal());
            
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
    public boolean actualizar(pedido obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE pedido SET Fecha_Entrega=?, Estado=?, Instrucciones_Especiales=?  WHERE id=?");
            ps.setDate(1, new java.sql.Date(obj.getFechaEntrega().getTime()));
            ps.setString(2, obj.getEstado());
            ps.setInt(3, obj.getId());
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
    public boolean desactivar(int id) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE pedido SET Estado='Cancelado' WHERE id=?");
            ps.setInt(1, id);
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
    public boolean activar(int id) {
        resp = false;
        try {                                                   //ajustar
            ps = CON.conectar().prepareStatement("UPDATE pedido SET Estado= WHERE id=?");
            ps.setInt(1, id);
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(id) FROM pedido");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(id)");
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
            ps = CON.conectar().prepareStatement("SELECT nombre FROM pedido WHERE nombre=?");
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
