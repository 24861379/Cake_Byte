package entidades;

import java.util.Arrays;
import java.util.Date;

public class pago {
    
    private int id_Pago;
    private int id_Pedido; //FK de pedido
    private double monto;
    private Date fechaPago;
    private String[] metodosPago = {"Targeta", "Efectivo", "Nequi"};

    public pago(){
        
    }

    public pago( double monto, Date fechaPago) {
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public int getId_Pago() {
        return id_Pago;
    }

    public void setId_Pago(int id_Pago) {
        this.id_Pago = id_Pago;
    }

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
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
        return "Pago\n" + "\nMonto: " + monto + "\nFecha de Pago: " + fechaPago + "\nMetodo de Pago: " + Arrays.toString(metodosPago);
    }
}
