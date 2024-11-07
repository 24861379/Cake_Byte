package datos;

import database.Conexion;
import datos.Interfaces.CrudDecoracion;
import entidades.decoracion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DecoracionDAO implements CrudDecoracion<decoracion>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
 
    public DecoracionDAO(){
        CON = Conexion.getinstancia();
    }

    @Override
    public List<decoracion> listar(String Texto) {
        List<decoracion> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM decoracion WHERE nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new decoracion(rs.getInt(1), rs.getString(2),rs.getDouble(4)));
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
    public boolean insertar(decoracion obj) {
        resp= false;
        try {                                                                                       
            ps= CON.conectar().prepareStatement("INSERT INTO torta (Nombre, Precio_Adicional) VALUES (?,?)");
            ps.setString(1, obj.getNombreDecoracion());
            ps.setDouble(2, obj.getPrecioAdicional());            
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
    public boolean actualizar(decoracion obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE torta SET Nombre=?, Precio_Adicional=? WHERE id=?");
            ps.setString(1, obj.getNombreDecoracion());
            ps.setDouble(2, obj.getPrecioAdicional());
            ps.setInt(3, obj.getIdDecoracion());
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(id) FROM decoracion");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(id)");
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
