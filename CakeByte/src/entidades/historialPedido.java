package entidades;

import java.util.Arrays;
import java.util.Date;

public class historialPedido {
    private int idHistorialP;
    private int id_Pedido;//FK de pedido
    private String[] estadoAnteriorHistorialP= {"Pendiente", "Confirmado", "En Preparacion", "Listo", "Entregado'", "Cancelado"};
    private Date fechaCambioHistorialP;
    private String observacionesHistorialP;

    public historialPedido() {
    }

    public historialPedido( Date fechaCambioHistorialP, String observacionesHistorialP) {
        this.fechaCambioHistorialP = fechaCambioHistorialP;
        this.observacionesHistorialP = observacionesHistorialP;
    }

    public int getIdHistorialP() {
        return idHistorialP;
    }

    public void setIdHistorialP(int idHistorialP) {
        this.idHistorialP = idHistorialP;
    }

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public String[] getEstadoAnteriorHistorialP() {
        return estadoAnteriorHistorialP;
    }

    public void setEstadoAnteriorHistorialP(String[] estadoAnteriorHistorialP) {
        this.estadoAnteriorHistorialP = estadoAnteriorHistorialP;
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
        return "historialPedido:\n" + "estado anterior del Historial:" + estadoAnteriorHistorialP + " fecha de cambio del historial: " + fechaCambioHistorialP + " observaciones de Historial: " + observacionesHistorialP ;
    }
}
