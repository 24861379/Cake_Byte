package negocio;

import datos.EmpleadoDAO;
import entidades.empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EmpleadoControl {
    
    private final EmpleadoDAO DATOS;
    private empleado obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    
    public EmpleadoControl() {
        this.DATOS = new EmpleadoDAO();
        this.obj = new empleado();
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar(String texto){
        List<empleado> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"Nombre", "Apellido", "Correo", "Telefono"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [4];
        this.registrosMostrados =0;
        
        for (empleado EMP : lista) {
            if (!EMP.getNombre().isEmpty() && !EMP.getApellido().isEmpty() && !EMP.getCorreo().isEmpty() && EMP.getTelefono()== 0 && !EMP.getPuesto().isEmpty()) {
                estado = "El empleado esta activo";
            }else{
                estado = "El empleado no existe";
            }

            registro[0] =EMP.getNombre();
            registro[1] =EMP.getApellido();
            registro[2] =EMP.getCorreo();
            registro[3] =Integer.toString(EMP.getTelefono());
//            registro[4] =EMP.getPuesto();
            
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(String Nombre, String Apellido, String Correo, int Telefono){
        if (DATOS.existencia(Nombre)&& DATOS.existencia(Apellido)) {
            return "El empleado ya existe";
        }else{
            obj.setNombre(Nombre);
            obj.setApellido(Apellido);
            obj.setCorreo(Correo);
            obj.setTelefono(Telefono);
//            obj.setPuesto(puesto);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(int idEmpleado, String nombre, String nombreAnterior, String apellido, String apellidoAnterior, String correo, int telefono, String puesto){
        if (nombre.equalsIgnoreCase(nombreAnterior)&& apellido.equalsIgnoreCase(apellidoAnterior)) {
            obj.setID_Empleado(idEmpleado);
            obj.setNombre(nombre);
            obj.setApellido(apellido);
            obj.setCorreo(correo);
            obj.setTelefono(telefono);
            obj.setPuesto(puesto);
            
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(nombre)&& DATOS.existencia(apellido)) {
                return "El registro ya existe";
            }else{
                obj.setID_Empleado(idEmpleado);
                obj.setNombre(nombre);
                obj.setApellido(apellido);
                obj.setCorreo(correo);
                obj.setTelefono(telefono);
                obj.setPuesto(puesto);
                
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
