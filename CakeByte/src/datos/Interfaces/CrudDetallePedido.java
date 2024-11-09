package datos.Interfaces;

import java.util.List;

public interface CrudDetallePedido <T> {
    public List<T> listar(String Texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean existencia(String existe);
    public int total();
}
