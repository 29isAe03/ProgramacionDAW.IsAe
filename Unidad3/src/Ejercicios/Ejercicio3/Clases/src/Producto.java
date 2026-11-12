
public class Producto {
    //Atributos
    private int Codigo;
    private String descripcion;
    private String color;
    private double costo;
    private Fabrica fabrica;

    //Constructores
    public Producto(){}

    public Producto(int Codigo, String descripcion, String color, double costo, Fabrica fabrica){
        this.Codigo=Codigo;
        this.descripcion=descripcion;
        this.color=color;
        this.costo=costo;
        this.fabrica=fabrica;
    }
    
    //Metodos
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void imprimirProducto(){
        System.out.println("Codigo; "+getCodigo());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Color: "+getColor());
        System.out.println("Costo: "+getCosto());
        if(this.fabrica != null){
            System.out.println("Fabrica: "+fabrica.getNombre());
        }
    }
}
