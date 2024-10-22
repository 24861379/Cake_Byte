package entidades;

import java.util.Arrays;
import java.util.Date;

public class pago {
    
    private int id;
    private double monto;
    private Date fechaPago;
    private String[] metodosPago = {"Targeta", "Efectivo", "Nequi"};

    public pago(){
        
    }
    
    public pago(int id, int idPedido, double monto, Date fechaPago) {
        this.id = id;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public int getIdPago() {
        return id;
    }

    public void setIdPago(int idPago) {
        this.id = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String[] getMetodosPago() {
        return metodosPago;
    }

    public void setMetodosPago(String[] metodosPago) {
        this.metodosPago = metodosPago;
    }

    @Override
    public String toString() {
        return "Pago\n" + "id: " + id + "\nMonto: " + monto + "\nFecha de Pago: " + fechaPago + "\nMetodo de Pago: " + Arrays.toString(metodosPago);
    }
}
