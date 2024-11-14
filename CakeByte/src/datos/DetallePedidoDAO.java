
package datos;

import database.Conexion;
import datos.Interfaces.CrudDetallePedido;
import entidades.detallePedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetallePedidoDAO implements CrudDetallePedido <detallePedido>{

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public DetallePedidoDAO() {
        CON = Conexion.getinstancia();
    }
    
    @Override
    public List listar(String Texto) {
        List<detallePedido> registros = new ArrayList();

        try {
            ps = CON.conectar().prepareStatement("SELECT dp.ID_Detalle, dp.ID_Pedido, dp.ID_Torta, dp.ID_Figura, dp.ID_Sabor, dp.ID_Decoracion, dp.Cantidad, dp.Precio_Unitario, dp.Subtotal FROM tb_detalle_pedido dp inner join tb_pedido p ON dp.ID_Pedido = p.ID_Pedido WHERE p.Nombre LIKE ? ORDER BY dp.ID_Detalle ASC LIMIT ?,?");
            ps.setString(1, "%" + Texto + "%");
            
            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new detallePedido(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),rs.getDouble(8), rs.getDouble(9)));
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
        return registros;
    }

    @Override
    public boolean insertar(detallePedido obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO tb_detalle_pedido (Cantidad, Precio_Unitario, Subtotal) VALUES (?,?,?)");
            ps.setInt(1, obj.getCantidad());
            ps.setDouble(2, obj.getPrecio_unitario());
            ps.setDouble(3, obj.getSubtotal());
            

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
    public boolean actualizar(detallePedido obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_detalle_pedido SET Cantidad=?, Precio_Unitario=?, Subtotal=? WHERE ID_Detalle=?");
            ps.setInt(1, obj.getCantidad());
            ps.setDouble(2, obj.getPrecio_unitario());
            ps.setDouble(3, obj.getSubtotal());
            ps.setInt(5, obj.getId_detalle_pedido());
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
    public boolean existencia(String existe) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT Cantidad FROM tb_detalle_pedido WHERE Cantidad=?, Subtotal=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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

    @Override
    public int total() {
        int totalRegistros = 0;
        try {                                                       //id          
            ps = CON.conectar().prepareStatement("SELECT COUNT(ID_Detalle_Pedido) FROM tb_detalle_pedido");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(ID_Detalle_Pedido)");
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


}
