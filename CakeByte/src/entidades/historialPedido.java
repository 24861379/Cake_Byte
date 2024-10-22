package entidades;

import java.util.Arrays;
import java.util.Date;

public class historialPedido {
    //id_historial FK
    //id_pedido FK
    //id_usuario FK
    private String[] estadoAnteriorHistorialP= {"Pendiente", "Confirmado", "En Preparacion", "Listo", "Entregado'", "Cancelado"};
    private String[] estadoNuevoHistorialP= {"Pendiente", "Confirmado", "En Preparacion", "Listo", "Entregado'", "Cancelado"};
    private Date fechaCambioHistorialP;
    private String observacionesHistorialP;

    public historialPedido() {
    }

    public historialPedido(Date fechaCambioHistorialP, String observacionesHistorialP) {
        this.fechaCambioHistorialP = fechaCambioHistorialP;
        this.observacionesHistorialP = observacionesHistorialP;
    }

    public String[] getEstadoAnteriorHistorialP() {
        return estadoAnteriorHistorialP;
    }

    public void setEstadoAnteriorHistorialP(String[] estadoAnteriorHistorialP) {
        this.estadoAnteriorHistorialP = estadoAnteriorHistorialP;
    }

    public String[] getEstadoNuevoHistorialP() {
        return estadoNuevoHistorialP;
    }

    public void setEstadoNuevoHistorialP(String[] estadoNuevoHistorialP) {
        this.estadoNuevoHistorialP = estadoNuevoHistorialP;
    }

    public Date getFechaCambioHistorialP() {
        return fechaCambioHistorialP;
    }

    public void setFechaCambioHistorialP(Date fechaCambioHistorialP) {
        this.fechaCambioHistorialP = fechaCambioHistorialP;
    }

    public String getObservacionesHistorialP() {
        return observacionesHistorialP;
    }

    public void setObservacionesHistorialP(String observacionesHistorialP) {
        this.observacionesHistorialP = observacionesHistorialP;
    }

    @Override
    public String toString() {
        return "Historial de pedido: " + "\nEstado Anterior: " + Arrays.toString(estadoAnteriorHistorialP) + "\nEstado Nuevo:" +Arrays.toString(estadoNuevoHistorialP)+ "\nFecha de cambio:" + fechaCambioHistorialP + "\nObservaciones: \n" + observacionesHistorialP;
    }

   
    
}
