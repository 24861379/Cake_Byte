package datos;

import database.Conexion;
import entidades.pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import datos.Interfaces.crudPedido;

public class PedidoDAO implements crudPedido <pedido> {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private int estadoIndex; // Índice que representa el estado actual
   
    public PedidoDAO(){
        CON = Conexion.getinstancia();
    }
    
    @Override
    public List<pedido> listar(String Texto) {
        List<pedido> registros = new ArrayList(); 
                                                                                        
        try {                                                                                                                                                                                                                                                                                             
            ps= CON.conectar().prepareStatement("SELECT " +
    "    p.ID_Pedido, " +
    "    c.Nombre AS Cliente, " +
    "    s.Nombre AS Sabor, " +
    "    f.Nombre AS Figura, " +
    "    d.Nombre AS Decoracion, " +
    "    p.Estado, " +
    "    p.Instrucciones_Especiales, " +
    "    p.Total " + // Espacio añadido aquí
    "FROM " +
    "    db_cake_byte.tb_pedido p " + // Espacio añadido aquí
    "INNER JOIN " +
    "    db_cake_byte.tb_cliente c ON p.ID_Cliente = c.ID_Cliente " +
    "INNER JOIN " +
    "    db_cake_byte.tb_sabor s ON p.ID_Sabor = s.ID_Sabor " +
    "INNER JOIN " +
    "    db_cake_byte.tb_figura f ON p.ID_Figura = f.ID_Figura " +
    "INNER JOIN " +
    "    db_cake_byte.tb_decoracion d ON p.ID_Decoracion = d.ID_Decoracion " +
    "WHERE " +
    "    p.Estado = 'Pendiente' AND " +
    "    c.Nombre LIKE ?");
            
            ps.setString(1, "%"+ Texto+ "%");
            
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new pedido( rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5), rs.getDouble(6)));
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
            ps= CON.conectar().prepareStatement("INSERT INTO tb_pedido ( Estado, Instrucciones_Especiales, Total) VALUES (?,?,?)");
            
            
            ps.setString(1, obj.getEstado()[estadoIndex]);// estadoIndex es el índice del estado actual
            ps.setString(2, obj.getInstruccionesEspeciales());
            ps.setDouble(3, obj.getTotal());
            
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
            ps = CON.conectar().prepareStatement("UPDATE tb_pedido SET  Estado=?, Instrucciones_Especiales=?  WHERE ID_Pedido=?");
            
            ps.setString(1, obj.getEstado()[estadoIndex]);
            ps.setInt(2, obj.getId_Pedido());
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
            ps = CON.conectar().prepareStatement("UPDATE tb_pedido SET Estado='Cancelado' WHERE ID_Pedido=?");
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
        try {                                                   
            ps = CON.conectar().prepareStatement("UPDATE tb_pedido SET Estado='Confirmado' WHERE ID_Pedido=?");
            ps.setInt(1,id);
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(ID_Pedido) FROM tb_pedido");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(ID_Pedido)");
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
            ps = CON.conectar().prepareStatement("SELECT ID_Pedido FROM tb_pedido WHERE ID_Pedido=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
