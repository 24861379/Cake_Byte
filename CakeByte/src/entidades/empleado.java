package entidades;

public class empleado {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Telefono;
    private String Puesto;

    public empleado(){
        
    }
    
    public empleado(int id, String Nombre, String Apellido, String Correo, int Telefono, String Puesto) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Puesto = Puesto;
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
        return "Empleado\n" + "id: " + id + "\nNombre: " + Nombre + " Apellido: " + Apellido + "\nCorreo: " + Correo + "\nTelefono: " + Telefono + "\nPuesto: " + Puesto;
    }
}
