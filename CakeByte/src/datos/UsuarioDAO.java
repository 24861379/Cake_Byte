package datos;

import database.Conexion;
import datos.Interfaces.CrudUsuario;
import entidades.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO implements CrudUsuario<usuario> {
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private int estadoIndexU;
    
    public UsuarioDAO(){
        CON = Conexion.getinstancia();
    }
    
    @Override
    public List<usuario> listar(String Texto) {
        
        List<usuario> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT u.ID_Usuario, u.ID_Cliente, u.ID_Empleado, u.Nombre_Usuario, u.Contrasena, u.Rol, c.Nombre AS ClienteNombre, e.Nombre AS EmpleadoNombre " +
            "FROM tb_usuario u " +
            "LEFT JOIN tb_cliente c ON u.ID_Cliente = c.ID_Cliente " +
            "LEFT JOIN tb_empleado e ON u.ID_Empleado = e.ID_Empleado " +
            "WHERE u.Nombre_Usuario LIKE ?");
            
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new usuario(rs.getString(1),rs.getString(2)));
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
    public boolean insertar(usuario obj) {
        resp= false;
        try {                                                                              // asi está en la base de datos         
            ps= CON.conectar().prepareStatement("INSERT INTO tb_usuario (Nombre_Usuario, Contrasena, ROl) VALUES (?,?,?)");
            
            ps.setString(1, obj.getNombre_Usuario());
            ps.setString(2, obj.getContraseña());
            ps.setString(3, obj.getRol()[estadoIndexU]);// estadoIndex es el índice del estado actual
            
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
    
    //actualizar contraseña
    @Override
    public boolean actualizar(usuario obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_usuario SET Nombre_Usuario=?, contrasena=? WHERE ID_Usuario=?");
            ps.setString(1, obj.getNombre_Usuario());
            ps.setString(2, obj.getContraseña());
            ps.setInt(3, obj.getID_Usuario());
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
            ps = CON.conectar().prepareStatement("SELECT Nombre_Usuario FROM tb_usuario WHERE Nombre_Usuario=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
