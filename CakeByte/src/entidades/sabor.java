package entidades;

public class sabor {
   private int idSabor;
   private String NombreSabor;
   private double precioAdicionalSabor;

    public sabor() {
    }

    public sabor(int idSabor, String NombreSabor, double precioAdicionalSabor) {
        this.idSabor = idSabor;
        this.NombreSabor = NombreSabor;
        this.precioAdicionalSabor = precioAdicionalSabor;
    }

    public int getIdSabor() {
        return idSabor;
    }

    public void setIdSabor(int idSabor) {
        this.idSabor = idSabor;
    }

    public String getNombreSabor() {
        return NombreSabor;
    }

    public void setNombreSabor(String NombreSabor) {
        this.NombreSabor = NombreSabor;
    }

    public double getPrecioAdicionalSabor() {
        return precioAdicionalSabor;
    }

    public void setPrecioAdicionalSabor(double precioAdicionalSabor) {
        this.precioAdicionalSabor = precioAdicionalSabor;
    }

    @Override
    public String toString() {
        return "Sabor \n" + NombreSabor + "\nPrecio adicional: " + precioAdicionalSabor;
    }      
}
