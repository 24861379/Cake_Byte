package datos;

import database.Conexion;
import datos.Interfaces.CrudSabor;
import entidades.sabor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SaborDAO implements CrudSabor<sabor>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
 
    public SaborDAO(){
        CON = Conexion.getinstancia();
    }

    @Override
    public List<sabor> listar(String Texto) {
        
        List<sabor> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM sabor WHERE nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new sabor(rs.getInt(1), rs.getString(2),rs.getDouble(3)));
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
    public boolean insertar(sabor obj) {
       resp= false;
        try {                                                                                       
            ps= CON.conectar().prepareStatement("INSERT INTO sabor (Nombre, PrecioAdicional) VALUES (?,?)");
            ps.setString(1, obj.getNombre());
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
    public boolean actualizar(sabor obj) {
         resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE sabor SET Nombre=?, PrecioAdicional=? WHERE id=?");
            ps.setString(1, obj.getNombre());
            ps.setDouble(2, obj.getPrecioAdicional());
            ps.setInt(3, obj.getId_Sabor());
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(id) FROM sabor");
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
