package datos;

import database.Conexion;
import datos.Interfaces.CrudSimpleInterface;
import entidades.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO implements CrudSimpleInterface<cliente> {
    
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ClienteDAO() {
        CON = Conexion.getinstancia();
    }

    
}
