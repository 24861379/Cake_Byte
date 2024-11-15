package datos;

import database.Conexion;
import datos.Interfaces.CrudHistorialPedido;
import entidades.historialPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HistorialPedidoDAO implements CrudHistorialPedido<historialPedido>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    int estadoIndex;

    public HistorialPedidoDAO() {
        CON = Conexion.getinstancia();
    }

    @Override
    public List listar(String Texto) {
        List<historialPedido> registros = new ArrayList();

        try {
            ps = CON.conectar().prepareStatement("SELECT hp.ID_Historial, hp.ID_Pedido, hp.Estado_Anterior, hp.Fecha_Cambio, hp.Observaciones FROM tb_historial_pedido hp inner join tb_pedido p ON hp.ID_Pedido = p.ID_Pedido WHERE p.Nombre LIKE ? ORDER BY hp.ID_Historial ASC LIMIT ?,?");
            ps.setString(1, "%" + Texto + "%");
            
            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new historialPedido( rs.getDate(1), rs.getString(2)));
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
    public boolean insertar(historialPedido obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO tb_historial_pedido (Estado_Anterior, Fecha_Cambio, Observaciones) VALUES (?,?,?)");
            ps.setString(1, obj.getEstadoAnteriorHistorialP()[estadoIndex]);
            ps.setDate(2, new java.sql.Date(obj.getFechaCambioHistorialP().getTime()));
            ps.setString(3, obj.getObservacionesHistorialP());
            

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
    public boolean actualizar(historialPedido obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_historial_pedido SET Estado_Anterior=?, Fecha_Cambio=?, Observaciones=?  WHERE ID_Historial=?");
            ps.setString(1, obj.getEstadoAnteriorHistorialP()[estadoIndex]);
            ps.setDate(2, new java.sql.Date(obj.getFechaCambioHistorialP().getTime()));
            ps.setInt(3, obj.getId_Pedido());
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
            ps = CON.conectar().prepareStatement("SELECT Fecha_Cambio FROM tb_historial_pedido WHERE Fecha_Cambio=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
