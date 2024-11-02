package entidades;

public class sabor {
    
   private int id_Sabor;
   private String Nombre;
   private double precioAdicional;

    public sabor() {
    }

    public sabor(int id_Sabor, String Nombre, double precioAdicional) {
        this.id_Sabor = id_Sabor;
        this.Nombre = Nombre;
        this.precioAdicional = precioAdicional;
    }

    public int getId_Sabor() {
        return id_Sabor;
    }

    public void setId_Sabor(int id_Sabor) {
        this.id_Sabor = id_Sabor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    

    @Override
    public String toString() {
        return "Sabor \n" + Nombre + "\nPrecio adicional: " + precioAdicional;
    }      
}
