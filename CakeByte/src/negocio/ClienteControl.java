package negocio;

import datos.ClienteDAO;
import entidades.cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClienteControl {
    
    private final ClienteDAO DATOS;
    private cliente obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    //realiza un conteo de cuantos registro hay en la tabla

    public ClienteControl() {
        this.DATOS = new ClienteDAO();
        this.obj = obj;
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar(String texto){
        List<cliente> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"Nombre", "Apellido", "Direccion", "Correo", "Telefono"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [5];
        this.registrosMostrados =0;
        
        for (cliente cli : lista) {
            if (!cli.getNombre().isEmpty() && !cli.getApellido().isEmpty() && !cli.getDireccion().isEmpty() && !cli.getCorreo().isEmpty() && cli.getTelefono() ==0) {
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            
//            registro[0] =Integer.toString(cli.getID_Cliente());
            registro[0] =cli.getNombre();
            registro[1] =cli.getApellido();
            registro[2] =cli.getDireccion();
            registro[3] =cli.getCorreo();
            registro[4] =Integer.toString(cli.getTelefono()) ;
            
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(String Nombre, String Apellido, String Direccion, String Correo, int Telefono){
        if (DATOS.existencia(Nombre)&& DATOS.existencia(Apellido)) {
            return "El registro ya existe";
        }else{
            obj.setNombre(Nombre);
            obj.setApellido(Apellido);
            obj.setDireccion(Direccion);
            obj.setCorreo(Correo);
            obj.setTelefono(Telefono);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(int idCliente, String nombre, String nombreAnterior, String apellido, String apellidoAnterior, String direccion, String correo, int telefono){
        if (nombre.equalsIgnoreCase(nombreAnterior)&& apellido.equalsIgnoreCase(apellidoAnterior)) {
            obj.setID_Cliente(idCliente);
            obj.setNombre(nombre);
            obj.setApellido(apellido);
            obj.setDireccion(direccion);
            obj.setCorreo(correo);
            obj.setTelefono(telefono);
            
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(nombre)&& DATOS.existencia(apellido)) {
                return "El registro ya existe";
            }else{
                obj.setID_Cliente(idCliente);
                obj.setNombre(nombre);
                obj.setApellido(apellido);
                obj.setDireccion(direccion);
                obj.setCorreo(correo);
                obj.setTelefono(telefono);
                
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
