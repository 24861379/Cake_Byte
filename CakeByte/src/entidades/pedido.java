package entidades;

import java.util.Arrays;
import java.util.Date;

public class pedido {
    Date fecha = new Date();
    private int id_Pedido;
    private int ID_Cliente; //FK de cliente
    private int ID_Sabor;
    private int ID_Figura;
    private int ID_Decoracion;
    private String[] estado = {"Pendiente", "Confirmado", "En Preparacion", "Listo", "Entregado'", "Cancelado"};
    private String InstruccionesEspeciales;
    private double total;

    public pedido() {
    }

    public pedido(int ID_Cliente, int ID_Sabor, int ID_Figura, int ID_Decoracion, String InstruccionesEspeciales, double total) {
        this.ID_Cliente = ID_Cliente;
        this.ID_Sabor = ID_Sabor;
        this.ID_Figura = ID_Figura;
        this.ID_Decoracion = ID_Decoracion;
        this.InstruccionesEspeciales = InstruccionesEspeciales;
        this.total = total;
    }

    

    public int getID_Sabor() {
        return ID_Sabor;
    }

    public void setID_Sabor(int ID_Sabor) {
        this.ID_Sabor = ID_Sabor;
    }

    public int getID_Figura() {
        return ID_Figura;
    }

    public void setID_Figura(int ID_Figura) {
        this.ID_Figura = ID_Figura;
    }

    public int getID_Decoracion() {
        return ID_Decoracion;
    }

    public void setID_Decoracion(int ID_Decoracion) {
        this.ID_Decoracion = ID_Decoracion;
    }

    
    
    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    public String getInstruccionesEspeciales() {
        return InstruccionesEspeciales;
    }

    public void setInstruccionesEspeciales(String InstruccionesEspeciales) {
        this.InstruccionesEspeciales = InstruccionesEspeciales;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido\n" + "Fecha: " + fecha + "\nEstado: " + Arrays.toString(estado)+ "\nInstrucciones especiales: " + InstruccionesEspeciales + "\nTotal: " + total;
    }  
}
