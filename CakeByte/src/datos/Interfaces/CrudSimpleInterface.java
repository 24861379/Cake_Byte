package datos.Interfaces;

import java.util.List;

//Solo para la clase cliente
public interface CrudSimpleInterface <T>{
    
    public List<T> listar(String Texto);
    public boolean insertar(T obj);
    public boolean existencia(String existe);
}

