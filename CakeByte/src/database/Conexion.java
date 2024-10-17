//aquí me conecto a la base de datos :)
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
           //constante
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "db_cake_byte";//nombre de la base de datos
    private final String USER = "root";//usuario
    private final String PASSWORD = "";//cloud computing
    
    public Connection cadena;
    //singleton patron de diseño
    public static Conexion instancia; //-->constructor de instancia
    
    //contructor 
    private Conexion(){
        this.cadena= null;
    }
    
    //método que retorna la conexión
    public Connection conectar(){
       try{
           Class.forName(DRIVER);
           //obtener lo que tiene URL, DB, PASSWORD
           this.cadena= DriverManager.getConnection(URL + DB, USER, PASSWORD);
           
       }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       return this.cadena;
    }
    
    //Método para desconectar
    public void desconectar(){
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
          //synchronized para que este sincronizando la clase conexion con la instancia
    public synchronized static Conexion getinstancia(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
