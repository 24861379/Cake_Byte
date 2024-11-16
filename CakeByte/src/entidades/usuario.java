
package entidades;

import java.util.Arrays;

public class usuario {
    private int ID_Usuario;
    private int ID_Cliente;
    private int ID_Empleado;
    private String Nombre_Usuario;
    private String Contraseña;
    private String[] Rol = {"Cliente", "Empleado", "Administrador"};

    public usuario() {
    }

    public usuario(String Nombre_Usuario, String Contraseña,String Rol) {
        this.Nombre_Usuario = Nombre_Usuario;
        this.Contraseña = Contraseña;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String[] getRol() {
        return Rol;
    }

    public void setRol(String[] Rol) {
        this.Rol = Rol;
    }

    @Override
    public String toString() {
        return "Usuario: \n"+"Nombre: "+Nombre_Usuario+ "\nContraseña del usuario: " + Contraseña + "\nRol del usuario: " +Arrays.toString(Rol);
    }  
}
