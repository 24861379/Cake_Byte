package datos;

import database.Conexion;
import datos.Interfaces.CrudFigura;
import entidades.figura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FiguraDAO implements CrudFigura<figura>{
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
 
    public FiguraDAO(){
        CON = Conexion.getinstancia();
    }

    @Override
    public List<figura> listar(String Texto) {
        
        List<figura> registros = new ArrayList(); 
        
        try {
            ps= CON.conectar().prepareStatement("SELECT * FROM figura WHERE nombre LIKE ?");
            ps.setString(1, "%"+ Texto+ "%");
            rs=ps.executeQuery();
            while(rs.next()){
                registros.add(new figura(rs.getInt(1), rs.getString(2),rs.getDouble(3)));
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
    public boolean insertar(figura obj) {
        resp= false;
        try {                                                                                       
            ps= CON.conectar().prepareStatement("INSERT INTO torta (Nombre, Precio_Adicional) VALUES (?,?)");
            ps.setString(1, obj.getNombre());
            ps.setDouble(2, obj.getPrecio_adicional());

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
    public boolean actualizar(figura obj) {
        
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE figura SET Nombre=?, Precio_Adicional=? WHERE id=?");
            ps.setString(1, obj.getNombre());
            ps.setDouble(2, obj.getPrecio_adicional());
            ps.setInt(3, obj.getId_figura());
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
            ps = CON.conectar().prepareStatement("SELECT COUNT(id) FROM figura");
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