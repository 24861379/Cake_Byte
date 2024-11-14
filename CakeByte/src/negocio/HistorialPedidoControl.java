package negocio;

import datos.HistorialPedidoDAO;
import entidades.historialPedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class HistorialPedidoControl {
    
    private final HistorialPedidoDAO DATOS;
    private historialPedido obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    SimpleDateFormat FCH = new SimpleDateFormat("dd/MM/yyyy");
    
    public HistorialPedidoControl() {
        this.DATOS = new HistorialPedidoDAO();
        this.obj = new historialPedido();
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar(String texto){
        List<historialPedido> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"ID_Historial_pedido", "ID_Pedido", "Estado_Anterior", "Fecha_Cambio", "Observaciones"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [7];
        this.registrosMostrados =0;
        
        for (historialPedido HPD : lista) {
            if (!HPD.getEstadoAnteriorHistorialP()[1].equals("Confirmado") && HPD.getFechaCambioHistorialP()== null && !HPD.getObservacionesHistorialP().isEmpty()) {
                estado = "Si hay un historial de pedido";
            }else{
                estado = "No hay un historial de pedido";
            }
            
            registro[0] =Integer.toString(HPD.getIdHistorialP());
            registro[1] =Integer.toString(HPD.getId_Pedido());
            registro[2] =HPD.getEstadoAnteriorHistorialP()[1];
            if(HPD.getFechaCambioHistorialP() != null){
                registro[3] = FCH.format(HPD.getFechaCambioHistorialP());
            }else{
                registro[3] = "";
            }
            registro[4] =HPD.getObservacionesHistorialP();
            
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(Date FechaCambio, String Observaciones){
        String fechaCambio = FCH.format(FechaCambio);
        if (DATOS.existencia(fechaCambio)) {
            return "El empleado ya existe";
        }else{
            obj.setFechaCambioHistorialP(FechaCambio);
            obj.setObservacionesHistorialP(Observaciones);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(Date fechaAnt,Date fechaAct, String obvservacione){
        if (fechaAnt.equals(fechaAct)) {
            obj.setFechaCambioHistorialP(fechaAct);
            obj.setObservacionesHistorialP(obvservacione);
            
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(Integer.toString(obj.getIdHistorialP()))) {
                return "El registro ya existe";
            }else{
                obj.setFechaCambioHistorialP(fechaAct);
                obj.setObservacionesHistorialP(obvservacione);
                
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
