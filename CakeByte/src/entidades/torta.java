package entidades;

public class torta {
   
    private int id;
    private String Nombre;
    private String Descripcion;
    private double precio_base;

    public torta(){
        
    }
    
    public torta(int id, String Nombre, String Descripcion, double precio_base) {
        this.id = id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio_base = precio_base;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    @Override
    public String toString() {
        return "Torta\n" + "id: " + id + "\nNombre: " + Nombre + "\nDescripcion: " + Descripcion + "\nPrecio base: " + precio_base;
    }
}
