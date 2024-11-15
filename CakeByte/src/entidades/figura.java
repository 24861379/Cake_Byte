package entidades;

public class figura {
    
    private int id_figura;
    private String Nombre;
    private double precio_adicional;

    public figura() {
    }

    public figura( String Nombre, double precio_adicional) {
        this.Nombre = Nombre;
        this.precio_adicional = precio_adicional;
    }

    public int getId_figura() {
        return id_figura;
    }

    public void setId_figura(int id_figura) {
        this.id_figura = id_figura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio_adicional() {
        return precio_adicional;
    }

    public void setPrecio_adicional(double precio_adicional) {
        this.precio_adicional = precio_adicional;
    }

    @Override
    public String toString() {
        return "Figura\n" + "\nNombre: " + Nombre + "\nPrecio adicional: " + precio_adicional;
    }
}
