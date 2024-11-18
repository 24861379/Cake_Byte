package negocio;

import datos.UsuarioDAO;
import entidades.usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UsuarioControl {
    
    private final UsuarioDAO DATOS;
    private usuario obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    
    public UsuarioControl() {
        this.DATOS = new UsuarioDAO();
        this.obj = new usuario();
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar (String Texto){
        List<usuario> lista = new ArrayList();
        lista.addAll(DATOS.listar(Texto));//recursividad
        
        String titulos[] = { "Nombre_Usuario", "Contraseña", "Rol"};
        this.modeltabla= new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal 
        String registro []= new String [3];
        
        this.registrosMostrados = 0;
        
        for (usuario USER : lista) {
            if (!USER.getNombre_Usuario().isEmpty() && !USER.getContraseña().isEmpty() && !USER.getRol().equals("")) {
                estado= "Activo";
            }else{
                estado = "Inativo";
            }
            

            registro [0] =USER.getNombre_Usuario();
            registro [1] =USER.getContraseña();
            registro [2] =USER.getRol()[0];
            
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(String NombreU, String password){
        if (DATOS.existencia(NombreU)&& DATOS.existencia(password)) {
            return "El registro ya existe";
        }else{
            obj.setNombre_Usuario(NombreU);
            obj.setContraseña(password);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(int idUsuario, String nombreU, String nombreUAnterior, String passwordU, String passwordUANT){
        if (nombreU.equalsIgnoreCase(nombreUAnterior)&& passwordU.equals(passwordUANT)) {
            obj.setID_Usuario(idUsuario);
            obj.setNombre_Usuario(nombreU);
            obj.setContraseña(passwordU);
  
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(nombreU)&& DATOS.existencia(passwordU)) {
                return "El registro ya existe";
            }else{
                obj.setID_Usuario(idUsuario);
                obj.setNombre_Usuario(nombreU);
                obj.setContraseña(passwordU);
                
                if (DATOS.actualizar(obj)) {
                    return "ok";
                }else{
                    return "Error en la atualizacion";
                }
            }
        }
    }
    
    public int totalMostrados(){
        return this.registrosMostrados;
    }
}
