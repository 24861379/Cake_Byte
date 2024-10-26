
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
        try {
            ps= CON.conectar().prepareStatement("INSERT INTO pedido (Fecha_Pedido, Fecha_Entrega, Estado, Instrucciones_Especiales, Total) VALUES (?,?,?,?,?)");
            
            ps.setDate(1, new java.sql.Date(obj.getFechaPedido().getTime()));// Convertir a java.sql.Date
            ps.setDate(2, new java.sql.Date(obj.getFechaEntrega().getTime()));
            ps.setString(3, obj.getEstado()[estadoIndex]);// estadoIndex es el índice del estado actual
            ps.setString(4, obj.getInstruccionesEspeciales());
            ps.setDouble(5, obj.getTotal());
            
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
            ps = CON.conectar().prepareStatement("UPDATE pedido SET Fecha_Entrega=?, Estado=?, Instrucciones_Especiales=?  WHERE id=?");
            ps.setDate(1, new java.sql.Date(obj.getFechaEntrega().getTime()));
            ps.setString(2, obj.getEstado()[estadoIndex]);
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
    public boolean existencia(String existe) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT nombre FROM pedido WHERE nombre=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
