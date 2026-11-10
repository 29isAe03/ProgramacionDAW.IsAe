package Ejercicios.Ejercicio1;

public class Pais {
    //Atributos
    private String nombre;
    private int poblacion;
    private int PIB;

    //Constructores
    public Pais(){}

    public Pais (String nombre, int poblacion, int PIB){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.PIB=PIB;
    }


    //Metodos

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int pIB) {
        PIB = pIB;
    }
      //Que imprima el PIB por capita
    public void pibPorCapita(){
        System.out.println("El PIB por capita de "+getNombre()+" es: "+(getPIB()*100000)/poblacion);
    }

    public static void main(String[] args) {
        Pais espana=new Pais("España", 498, 100 );
        System.out.println(espana.getPoblacion());
        espana.pibPorCapita();
    }
    
}
