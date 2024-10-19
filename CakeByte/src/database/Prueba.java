package database;

public class Prueba {
    
    public static void main(String[] args) {
        Conexion con = Conexion.getinstancia();
        con.conectar();
        if(con.cadena != null){
            System.out.println("Conectado");
        }else
            System.out.println("Desconectado");
    }
}
