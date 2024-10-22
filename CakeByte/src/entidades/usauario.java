
package entidades;

import java.util.Arrays;

public class usauario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseñaUsuario;
    private String[] rolUsuario = {"Cliente", "Empleado", "Administrador"};

    public usauario() {
    }

    public usauario(int idUsuario, String nombreUsuario, String contraseñaUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public String[] getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String[] rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public String toString() {
        return "Usauario: \n"+ "Contraseña del usuario: " + contraseñaUsuario + "\nRol del usuario: " +Arrays.toString(rolUsuario);
    }
    
    
}
