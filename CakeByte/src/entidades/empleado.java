package entidades;

public class empleado   {
    
    private int ID_Empleado;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Telefono;
    private String Puesto;
    

    public empleado() {
    }

    public empleado(String Nombre, String Apellido, String Correo, int Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        Puesto = "Pastelero";
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    @Override
    public String toString() {
        return "Empleado:\n" + "Nombre: " + Nombre + " Apellido:" + Apellido + " Correo: " + Correo + " Telefono: " + Telefono + " Puesto: " + Puesto ;
    }
}
