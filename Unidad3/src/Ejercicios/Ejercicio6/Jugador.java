package Ejercicios.Ejercicio6;

public class Jugador {
    //Atributos
    private String nombre;
    private Carta carta;

    //Constructores
    public Jugador(){}

    public Jugador(String nombre, Carta carta){
        this.nombre=nombre;
        this.carta=carta;
    }

    public Jugador(Jugador copia){}

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta getCarta() {
        return carta;
    }
    
    public void setCarta(Carta carta) {
        this.carta=carta;
    }

    public void imprimirJugador(){
        System.out.println("Nombre: "+getNombre());
    }
}
