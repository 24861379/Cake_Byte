package entidades;

public class empleado extends cliente {
    private String Puesto;

    public empleado() {
    }

    public empleado(int id, String Nombre, String Apellido, String Direccion, String Correo, int Telefono, String Puesto) {
        super(id, Nombre, Apellido, Direccion, Correo, Telefono);
        this.Puesto = Puesto;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    @Override
    public String Informacion() {
        super.Informacion();
        return "Empleado\n" +"\nPuesto: " + Puesto;
    }
}
