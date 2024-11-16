package entidades;

public class decoracion {
    
    private int idDecoracion;
    private String nombreDecoracion;
    private double precioAdicional;

    public decoracion() {
    }

    public decoracion(String nombreDecoracion, double precioAdicional) {
        this.nombreDecoracion = nombreDecoracion;
        this.precioAdicional = precioAdicional;
    }

    public int getIdDecoracion() {
        return idDecoracion;
    }

    public void setIdDecoracion(int idDecoracion) {
        this.idDecoracion = idDecoracion;
    }

    public String getNombreDecoracion() {
        return nombreDecoracion;
    }

    public void setNombreDecoracion(String nombreDecoracion) {
        this.nombreDecoracion = nombreDecoracion;
    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "Decoracion \n"+ "Nombrede la decoracion: " + nombreDecoracion + "\nPrecio adicional: " + precioAdicional;
    }
}
