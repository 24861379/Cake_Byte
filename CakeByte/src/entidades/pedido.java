package entidades;

import java.util.Date;

public class pedido {
    Date fecha = new Date();
    private int id;
    private Date fechaPedido;
    private Date fechaEntrega;
    private String estado;
    private String InstruccionesEspeciales;
    private double total;

    public pedido() {
    }
    
    public pedido(int id,Date fechaPedido, Date fechaEntrega, String estado, String InstruccionesEspeciales, double total) {
        this.id=id;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.InstruccionesEspeciales = InstruccionesEspeciales;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInstruccionesEspeciales() {
        return InstruccionesEspeciales;
    }

    public void setInstruccionesEspeciales(String InstruccionesEspeciales) {
        this.InstruccionesEspeciales = InstruccionesEspeciales;
    }

    public double getToal() {
        return total;
    }

    public void setToal(double toal) {
        this.total = toal;
    }

    @Override
    public String toString() {
        return "Pedido\n" + "Fecha: " + fecha + "\nFecha pedido: " + fechaPedido + "\nFecha de entrega: " + fechaEntrega + "\nEstado: " + estado + "\nInstrucciones especiales:" + InstruccionesEspeciales + "\nTotal=" + total;
    }
    
    
    
}
