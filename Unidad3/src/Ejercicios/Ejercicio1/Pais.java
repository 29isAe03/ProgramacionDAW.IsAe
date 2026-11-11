package Ejercicios.Ejercicio1;

public class Pais {
    //Atributos
    private String nombre;
    private int poblacion;
    private int PIB;

    //Constructores
    //Constructor por defecto
    public Pais(){}
    //Constructor por parametros
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
        System.out.println("El PIB por capita de "+getNombre()+" es: "+(getPIB()*100000)/poblacion+" euros por persona");
    }

    public static void main(String[] args) {
        //Creo un objeto que sea un pais poniendo el nombre, poblacion y el PIB.
        Pais espana=new Pais("España", 49, 448 );
        espana.pibPorCapita();
        Pais francia=new Pais("Francia", 69, 759);
        francia.pibPorCapita();
        //Los datos estan en millones al estar tratando con numeros muy grandes
    }
    
}
