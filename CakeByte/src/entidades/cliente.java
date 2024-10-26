package entidades;

public class cliente {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Correo;
    private int Telefono;

    public cliente(){
        
    }
    
    public cliente(int id, String Nombre, String Apellido, String Direccion, String Correo, int Telefono) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    public String Informacion() {
        return "Cliente\n " + "Nombre: " + Nombre + " Apellido: " + Apellido + "\nDireccion: " + Direccion + "\nCorreo: " + Correo + "\nTelefono: " + Telefono;
    }
}
