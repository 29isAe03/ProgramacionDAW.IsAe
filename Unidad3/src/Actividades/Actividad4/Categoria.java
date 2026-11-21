package Actividades.Actividad4;

public class Categoria {
    //Atributos
    private int codigo;
    private String nombre;

    //Constructores

    public Categoria(){
    }

    public Categoria(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public Categoria(Categoria copia){}

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

    public void imprimirCategoria(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getCodigo());
    }

    
}
