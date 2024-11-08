package datos.Interfaces;

import java.util.List;

//creo el objeto de List 
public interface crudPedido <T> {
    public List<T> listar(String Texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean desactivar(int id);
    public boolean activar(int id);
    public int total();
    public boolean existencia(String existe);
}
