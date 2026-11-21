package Actividades.Actividad4;

public class Proveedor_Sumistra_Pieza {
    //Atributos
    private Proveedor proveedor;
    private Pieza pieza;
    private String hora;
    private int cantidad;

    //Construcores

    public Proveedor_Sumistra_Pieza(){}

    public Proveedor_Sumistra_Pieza(Proveedor proveedor, Pieza pieza, String hora, int cantidad){
        this.proveedor=proveedor;
        this.pieza=pieza;
        this.hora=hora;
        this.cantidad=cantidad;
    }

    public Proveedor_Sumistra_Pieza(Proveedor_Sumistra_Pieza copia){}

    //Metodos

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void imprimirProovedor_Suministra_Pieza(){
        System.out.println("Proveedor: "+getProveedor().getCodigo());
        System.out.println("Pieza: "+getPieza().getCodigo());
        System.out.println("Hora: "+getHora());
        System.out.println("Cantidad: "+getCantidad());
    }

    

}
