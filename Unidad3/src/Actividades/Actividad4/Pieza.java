package Actividades.Actividad4;

public class Pieza {
    //Atributos
    private int codigo;
    private String nombre;
    private String color;
    private int precio;
    private Categoria categoria;

    //Constructores

    public Pieza(){}

    public Pieza(int codigo, String nombre, String color, int precio, Categoria categoria){
        this.codigo=codigo;
        this.nombre=nombre;
        this.color=color;
        this.precio=precio;
        this.categoria=categoria;
    }

    public Pieza(Categoria copia){}

    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void imprimirPieza(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Color: "+getColor());
        System.out.println("Codigo de categoria: "+getCategoria().getCodigo());
    }

    
    
}
