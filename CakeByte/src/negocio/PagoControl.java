
package negocio;

import datos.PagoDAO;
import entidades.pago;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class PagoControl {
    
    private final PagoDAO DATOS;
    private pago obj;
    private DefaultTableModel modeltabla;
    public int registrosMostrados;
    //realiza un conteo de cuantos registro hay en la tabla
    SimpleDateFormat PGC = new SimpleDateFormat("dd/MM/yyyy");

    public PagoControl() {
        this.DATOS = new PagoDAO();
        this.obj = obj;
        this.registrosMostrados= 0;
    }
    
    public DefaultTableModel listar(String texto){
        List<pago> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String titulos[] ={"ID_Pago", "ID_Pedido", "Metodo_Pago", "Monto", "Fecha_Pago"};
        this.modeltabla = new DefaultTableModel(null, titulos);
        
        String estado;
        //vector temporal
        String registro [] = new String [5];
        this.registrosMostrados =0;
        
        for (pago pgo : lista) {
            if (!pgo.getMetodosPago()[1].equals("Targeta") && pgo.getMonto()==0 && pgo.getFechaPago()==null) {
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            
            registro[0] =Integer.toString(pgo.getId_Pago());
            registro[1] =Integer.toString(pgo.getId_Pedido());
            registro[2] =pgo.getMetodosPago()[0];
            registro[3] =Double.toString(pgo.getMonto());
            if(pgo.getFechaPago()!= null){
                registro[4] = PGC.format(pgo.getFechaPago());
            }else{
                registro[4] = "";
            }
            //agregado el registro a default model table
            this.modeltabla.addRow(registro);
            this.registrosMostrados ++;
        }
        return this.modeltabla;
    }
    
    public String insertar(Double monto, Date FechaPago){
        String fechaCambio = PGC.format(FechaPago);
        if (DATOS.existencia(fechaCambio)) {
            return "El pago ya existe";
        }else{
            obj.setFechaPago(FechaPago);
            obj.setMonto(monto);
            
            if (DATOS.insertar(obj)) {
                return "Registro de pago exitoso";
            }else{
                return "Error en el registro";
            }
        }
    }
    
    public String actualizar(Double monto, Date FechaPago, Date FechaPagoAnt){
        if (!FechaPagoAnt.equals(FechaPago)) {
            obj.setFechaPago(FechaPago);
            obj.setMonto(monto);
            
            if(DATOS.actualizar(obj)){
                return "Información actualizada";
            }else{
                return "Error en la actualización";
            } 
        }else{
            if (DATOS.existencia(Integer.toString(obj.getId_Pago()))) {
                return "El registro ya existe";
            }else{
                obj.setFechaPago(FechaPago);
                obj.setMonto(monto);                
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
