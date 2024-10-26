package datos;
//usuario
import database.Conexion;
import datos.Interfaces.CrudSimpleInterface;
import entidades.empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoDAO implements CrudSimpleInterface<empleado> {

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
            ps = CON.conectar().prepareStatement("SELECT * FROM empleado WHERE nombre LIKE ?");
            ps.setString(1, "%" + Texto + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                registros.add(new empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
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
            ps = CON.conectar().prepareStatement("INSERT INTO empleado (Nombre,Apellido,Direccion,Correo,Telefono, puesto) VALUES (?,?,?,?,?,?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getDireccion());
            ps.setString(4, obj.getCorreo());
            ps.setInt(5, obj.getTelefono());
            ps.setString(6, obj.getPuesto());

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
            ps = CON.conectar().prepareStatement("SELECT nombre FROM empleado WHERE nombre=?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
