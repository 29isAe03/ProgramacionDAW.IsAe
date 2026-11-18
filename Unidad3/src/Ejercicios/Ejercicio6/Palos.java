package Ejercicios.Ejercicio6;

public class Palos {
    //Atributos
    private int valor;
    private String nombre;

    //Constructores
    public Palos(){}

    public Palos(int valor, String nombre){
        this.valor=valor;
        this.nombre=nombre;
    }

    public Palos(Palos copia){}

    //Metodos

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    
}
