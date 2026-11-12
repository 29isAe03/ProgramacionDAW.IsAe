public class Vende {
    //Atributos
    private double precioVenta;
    private Sucursal sucursal;
    private Producto producto;

    //Constructores
    public Vende(){}

    public Vende(double precioVenta, Sucursal sucursal, Producto producto){
        this.precioVenta=precioVenta;
        this.sucursal=sucursal;
        this.producto=producto;
    }
    
    //Metodos
    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void imprimirVende(){
        System.out.println("Precio venta: "+getPrecioVenta());
        if(this.sucursal != null){
            System.out.println("Sucursal: "+sucursal.getCiudad());

        }
        else if(this.producto != null){
            System.out.println("Producto: "+producto.getDescripcion());
        }
  
    }
    
}
