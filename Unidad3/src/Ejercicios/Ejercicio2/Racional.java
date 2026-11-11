package Ejercicios.Ejercicio2;

public class Racional {
    //Atributos
    private int numerador;
    private int denominador;

    //Constructores
    //Constructor por defecto
    public Racional(){};

    //Constructor por parametros
    public Racional(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    

    //Metodos
    //Getters y Setters

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //
    public void asignaNumerador(int x){
        this.numerador=x;

    }

    public void asignaDenominador(int y){
        this.denominador=y;
    }

    public void imprimirRacional(){
        System.out.println(getNumerador()+"/"+getDenominador());    
    }
    public void suma(Racional racional2){
        
    }
    public void resta(){
    }
    public void producto(){
    }
    public void division(){
    }



    public static void main(String[] args) {
        Racional racional1=new Racional();

        racional1.asignaNumerador(4);
        racional1.asignaDenominador(2);
        racional1.imprimirRacional();
        racional1.suma();
        racional1.resta();
        racional1.producto();
        racional1.division();
        
    }


}
