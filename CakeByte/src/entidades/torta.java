package entidades;

public class torta {
   
    private int ID_Torta;
    private String Nombre;
    private String Descripcion;
    private double precio_base;

    public torta(){
        
    }
    
    public torta(int ID_Torta, String Nombre, String Descripcion, double precio_base) {
        this.ID_Torta = ID_Torta;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio_base = precio_base;
    }

    public int getId() {
        return ID_Torta;
    }

    public void setId(int ID_Torta) {
        this.ID_Torta = ID_Torta;
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
        return "Torta\n" + "\nNombre: " + Nombre + "\nDescripcion: " + Descripcion + "\nPrecio base: " + precio_base;
    }
}
