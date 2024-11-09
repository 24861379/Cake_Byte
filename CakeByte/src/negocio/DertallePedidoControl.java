package negocio;

import datos.DetallePedidoDAO;
import entidades.detallePedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DertallePedidoControl {
    
    private final DetallePedidoDAO DATOS;
    private detallePedido obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    
    public DertallePedidoControl() {
        this.DATOS = new DetallePedidoDAO();
        this.obj = new detallePedido();
        this.registrosMostrados= 0;
    }
    
    
    public DefaultTableModel listar(String texto){
        List<detallePedido> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"ID_Detalle", "ID_Pedido", "ID_Torta","ID_Figura", "ID_Sabor", "ID_Decoracion", "Cantidad", "Precio_Unitario", "Subtotal"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [7];
        this.registrosMostrados =0;
        
        for (detallePedido DP : lista) {
            if (DP.getCantidad()==0 && DP.getPrecio_unitario()==0 && DP.getSubtotal()==0 ) {
                estado = "no hay ningun detalle del pedido";
            }else{
                estado = "hay detalles del pedido";
            }
            
            registro[0] =Integer.toString(DP.getId_detalle_pedido());
            registro[1] =Integer.toString(DP.getId_Pedido());
            registro[2] =Integer.toString(DP.getID_Torta());
            registro[3] =Integer.toString(DP.getId_figura());
            registro[4] =Integer.toString(DP.getId_Sabor());
            registro[5] =Integer.toString(DP.getIdDecoracion());
            registro[6] =Integer.toString(DP.getCantidad());
            registro[7] =Double.toString(DP.getPrecio_unitario());
            registro[8] =Double.toString(DP.getSubtotal());
            
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(int cantidad, double precioUnitario, double subTotal){
        if (DATOS.existencia(Integer.toString(cantidad))&& DATOS.existencia(Double.toString(precioUnitario))&& DATOS.existencia(Double.toString(subTotal))) {
            return "El detalle del pedido ya existe";
        }else{
            obj.setCantidad(cantidad);
            obj.setPrecio_unitario(precioUnitario);
            obj.setSubtotal(subTotal);
            
            if (DATOS.insertar(obj)) {
                return "Registro exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(int cantidad,int cantidadaAnt, double precioUnitario, double subtotal){
        if (cantidad == cantidadaAnt) {
            obj.setCantidad(cantidad);
            obj.setPrecio_unitario(precioUnitario);
            obj.setSubtotal(subtotal);
            
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(Integer.toString(cantidad))) {
                return "El registro ya existe";
            }else{
                obj.setCantidad(cantidad);
                obj.setPrecio_unitario(precioUnitario);
                obj.setSubtotal(subtotal);
                
                if (DATOS.actualizar(obj)) {
                    return "ok";
                }else{
                    return "Error en la atualizacion";
                }
            }
        }
    }
    
    public int total(){
        return DATOS.total();
    }
    
    public int totalMostrados(){
        return this.registrosMostrados;
    }
}
