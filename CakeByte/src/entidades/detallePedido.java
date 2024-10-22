package entidades;

public class detallePedido {
    
    private int id_detalle_pedido;
    private int cantidad;
    private double precio_unitario;
    private double subtotal;

    
    public detallePedido(){
        
    }
    
    public detallePedido(int id_detalle_pedido, int cantidad, double precio_unitario, double subtotal) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }

    public int getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(int id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Detalle del pedido\n" + "\nCantidad: " + cantidad + "\nPrecio Unitario: " + precio_unitario + "\nSubtotal: " + subtotal;
    }
}
