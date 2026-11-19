package Actividades.Actividad1.Actividad2;

public class Ciudad {
    //Atributos
    private int codigo;
    private String nombre;
    private int indicativo;
    
    //Constructoes

    public Ciudad(){}

    public Ciudad(int codigo, String nombre, int indicativo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.indicativo=indicativo;
    }

    public Ciudad(Ciudad copia){}

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

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public void imprimirCiudad(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Indicativo: "+getIndicativo());
    }

    
}
