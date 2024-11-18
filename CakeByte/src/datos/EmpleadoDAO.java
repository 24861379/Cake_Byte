package datos;

import database.Conexion;
import entidades.empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import datos.Interfaces.CrudEmpleado;

public class EmpleadoDAO implements CrudEmpleado<empleado> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    
    public EmpleadoDAO(){
      CON = Conexion.getinstancia();
    }
    
    @Override
    public List<empleado> listar(String Texto) {

        List<empleado> registros = new ArrayList<>();

        try {                                       
            ps = CON.conectar().prepareStatement("SELECT tb_empleado.Nombre, tb_empleado.Apellido, tb_empleado.Correo, tb_empleado.Telefono FROM tb_empleado WHERE Nombre LIKE ?");
            ps.setString(1, "%" + Texto + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new empleado(rs.getString(1), rs.getString(2), rs.getString(3),  rs.getInt(4)));
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
    public boolean insertar(empleado obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO tb_empleado (Nombre, Apellido, Correo, Telefono) VALUES (?,?,?,?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getCorreo());
            ps.setInt(4, obj.getTelefono());

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
    public boolean actualizar(empleado obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_empleado SET Nombre=?, Apellido=?, Correo=?, Telefono=? WHERE ID_Empleado=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getCorreo());
            ps.setInt(4, obj.getTelefono());
            ps.setInt(5, obj.getID_Empleado());
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
            ps = CON.conectar().prepareStatement("SELECT Nombre FROM tb_empleado WHERE Nombre=? ",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
