package datos;

import database.Conexion;
import datos.Interfaces.CrudTorta;
import entidades.torta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TortaDAO implements CrudTorta<torta>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
 
    public TortaDAO(){
        CON = Conexion.getinstancia();
    }

    @Override
    public List<torta> listar(String Texto) {
        
        List<torta> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM tb_torta WHERE Nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new torta( rs.getString(1),rs.getString(2),rs.getDouble(3)));
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
    public boolean insertar(torta obj) {
       
        resp= false;
        try {                                                                                       
            ps= CON.conectar().prepareStatement("INSERT INTO tb_torta (Nombre, Descripcion, Precio_base) VALUES (?,?,?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDescripcion());
            ps.setDouble(3, obj.getPrecio_base());
            
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
    public boolean actualizar(torta obj) {
       
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE tb_torta SET Nombre=?, Descripcion=?, Precio_Base=? WHERE ID_Torta=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDescripcion());
            ps.setDouble(3, obj.getPrecio_base());
            ps.setInt(4, obj.getID_Torta());
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(ID_Torta) FROM tb_torta");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(ID_Torta)");
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
