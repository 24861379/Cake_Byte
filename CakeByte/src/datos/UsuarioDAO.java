
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
            ps= CON.conectar().prepareStatement("SELECT * FROM usuario WHERE nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new usuario(rs.getInt(1), rs.getString(2),rs.getString(3)));
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
            ps= CON.conectar().prepareStatement("INSERT INTO usuario (Nombre_Usuario, Contrasena, ROl) VALUES (?,?,?)");
            
            ps.setString(1, obj.getNombreUsuario());
            ps.setString(2, obj.getContraseñaUsuario());
            ps.setString(3, obj.getRolUsuario()[estadoIndexU]);// estadoIndex es el índice del estado actual
            
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
            ps = CON.conectar().prepareStatement("UPDATE usuario SET Nombre_Usuario=?, contrasena=? WHERE id=?");
            ps.setString(1, obj.getNombreUsuario());
            ps.setString(2, obj.getContraseñaUsuario());
            ps.setInt(3, obj.getIdUsuario());
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
            ps = CON.conectar().prepareStatement("SELECT nombre FROM usuario WHERE nombre=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
