package datos.Interfaces;

import java.util.List;

public interface CrudSabor<T> {
    
    public List<T> listar(String Texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public int total(); 
}
