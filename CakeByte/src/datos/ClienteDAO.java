package datos;

import database.Conexion;
import entidades.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import datos.Interfaces.CrudCliente;

public class ClienteDAO implements CrudCliente<cliente> {
    
    protected final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ClienteDAO() {
        CON = Conexion.getinstancia();
    }
    
    @Override
    public List<cliente> listar(String Texto) {

        List<cliente> registros = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM tb_cliente WHERE Nombre LIKE ?");
            ps.setString(1, "%" + Texto + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new cliente( rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
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
    public boolean insertar(cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO tb_cliente (Nombre, Apellido, Direccion, Correo, Telefono) VALUES (?,?,?,?,?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getDireccion());
            ps.setString(4, obj.getCorreo());
            ps.setInt(5, obj.getTelefono());

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
            ps = CON.conectar().prepareStatement("SELECT Nombre FROM tb_cliente WHERE Nombre=? AND Apellido=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
    public boolean actualizar(cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_cliente SET Nombre=?, Apellido=?, Direccion=?, Correo=?, Telefono=? WHERE ID_Cliente=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getDireccion());
            ps.setString(4, obj.getCorreo());
            ps.setInt(5, obj.getTelefono());
            ps.setInt(6, obj.getID_Cliente());
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
}
