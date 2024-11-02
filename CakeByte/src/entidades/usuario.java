
package entidades;

import java.util.Arrays;

public class usuario {
    private int ID_Usuario;
    private String Nombre_Usuario;
    private String Contraseña;
    private String[] Rol = {"Cliente", "Empleado", "Administrador"};

    public usuario() {
    }

    public usuario(int ID_Usuario, String Nombre_Usuario, String Contraseña) {
        this.ID_Usuario = ID_Usuario;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Contraseña = Contraseña;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
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
