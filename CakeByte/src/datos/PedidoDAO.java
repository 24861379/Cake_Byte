package datos;

import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PedidoDAO {
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp; 
   
    public PedidoDAO(){
    
    }
}
