package negocio;

import datos.PedidoDAO;
import entidades.pedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PedidoControl {
    
    private final PedidoDAO DATOS;
    private pedido obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    //realiza un conteo de cuantos registro hay en la tabla
//    SimpleDateFormat PGC = new SimpleDateFormat("dd/MM/yyyy");

    public PedidoControl() {
        this.DATOS = new PedidoDAO();
        this.obj = obj;
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar(String texto){
        List<pedido> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"ID_Pedido", "ID_Cliente", "sabor torta", "figura torta", "decoración torta", "Estado", "Instrucciones_Especiales", "Total"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [8];
        this.registrosMostrados =0;
        
        for (pedido PDD : lista) {
            if ( PDD.getEstado()[5].equals("Cancelado") && PDD.getInstruccionesEspeciales().isEmpty() && PDD.getTotal()==0) {
                estado = "Inactivo";
            }else{
                estado = "Activo";
            }
            
            registro[0] =Integer.toString(PDD.getId_Pedido());
            registro[1] =Integer.toString(PDD.getID_Cliente());
            registro[2] =Integer.toString(PDD.getID_Sabor());
            registro[3] =Integer.toString(PDD.getID_Figura());
            registro[4] =Integer.toString(PDD.getID_Decoracion());
            registro[5] =PDD.getEstado()[0];
            registro[6] =PDD.getInstruccionesEspeciales();
            registro[7] =Double.toString(PDD.getTotal());

            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar( String instruccionesEs, Double Total){
        if (DATOS.existencia(Integer.toString(obj.getId_Pedido()))) {
            return "El registro ya existe";
        }else{

            obj.setInstruccionesEspeciales(instruccionesEs);
            obj.setTotal(Total);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
//    public String actualizar(Date fechaPedido, Date fechaPedidoAnt, Date fechaEntrega, String instruccionesEs, Double Total){
//        if (fechaPedido == fechaPedidoAnt) {
//            obj.setFechaPedido(fechaPedido);
//            obj.setFechaEntrega(fechaEntrega);
//            obj.setInstruccionesEspeciales(instruccionesEs);
//            obj.setTotal(Total);
//            
//            if(DATOS.actualizar(obj)){
//                return "Información actualizada";
//            }else{
//                return "Error en la actualización";
//            } 
//        }else{
//            if (DATOS.existencia(Integer.toString(obj.getId_Pedido()))) {
//                return "El registro ya existe";
//            }else{
//                obj.setFechaPedido(fechaPedido);
//                obj.setFechaEntrega(fechaEntrega);
//                obj.setInstruccionesEspeciales(instruccionesEs);
//                obj.setTotal(Total);
//                
//                if (DATOS.actualizar(obj)) {
//                    return "ok";
//                }else{
//                    return "Error en la atualizacion";
//                }
//            }
//        }
//    }
    
    public String desctivar(int id){
        if (DATOS.desactivar(id)) {
            return "Se desactivo";
        }else{
            return "No se puede desativar el registro";
        }
    }
    
    public String activar(int id){
        if (DATOS.activar(id)) {
            return "Se activo";
        }else{
            return "No se puede activar el registro";
        }
    }
    
    public int totalMostrados(){
        return this.registrosMostrados;
    }
}
