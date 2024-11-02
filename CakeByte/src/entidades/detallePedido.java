package entidades;

public class detallePedido {
    
    private int id_detalle_pedido;
    private int id_Pedido; //FK de pedido
    private int ID_Torta;//FK de torta
    private int id_figura; //FK de figura
    private int id_Sabor; //FK de sabor
    private int idDecoracion; //FK de decoracion
    private int cantidad;
    private double precio_unitario;
    private double subtotal;

    public detallePedido(){
        
    }

    public detallePedido(int id_detalle_pedido, int id_Pedido, int ID_Torta, int id_figura, int id_Sabor, int idDecoracion, int cantidad, double precio_unitario, double subtotal) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.id_Pedido = id_Pedido;
        this.ID_Torta = ID_Torta;
        this.id_figura = id_figura;
        this.id_Sabor = id_Sabor;
        this.idDecoracion = idDecoracion;
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

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public int getID_Torta() {
        return ID_Torta;
    }

    public void setID_Torta(int ID_Torta) {
        this.ID_Torta = ID_Torta;
    }

    public int getId_figura() {
        return id_figura;
    }

    public void setId_figura(int id_figura) {
        this.id_figura = id_figura;
    }

    public int getId_Sabor() {
        return id_Sabor;
    }

    public void setId_Sabor(int id_Sabor) {
        this.id_Sabor = id_Sabor;
    }

    public int getIdDecoracion() {
        return idDecoracion;
    }

    public void setIdDecoracion(int idDecoracion) {
        this.idDecoracion = idDecoracion;
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
