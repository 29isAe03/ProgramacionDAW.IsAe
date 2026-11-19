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

    //Hago el metodo que asigne numerador y denominador
    public void asignaNumerador(int x){
        this.numerador=x;

    }

    public void asignaDenominador(int y){
        this.denominador=y;
    }
    //Hago el que te imprima el racional
    public void imprimirRacional(){
        System.out.println(getNumerador()+"/"+getDenominador());    
    }
    //Para la suma hago que se multipliquen hago la logica del mcm
    public void suma(Racional b){
        int num = (getNumerador() * b.getDenominador()) + (b.getNumerador() * getDenominador());
        int den = getDenominador() * b.getDenominador();
        System.out.println(getNumerador()+"/"+getDenominador()+" + "+b.getNumerador()+"/"+b.getDenominador()+" = "+num+"/"+den);
        
    }
    //Lo mismo para la resta
    public void resta(Racional b){
        int num = (getNumerador() * b.getDenominador()) - (b.getNumerador() * getDenominador());
        int den = getDenominador() * b.getDenominador();
        System.out.println(getNumerador()+"/"+getDenominador()+" - "+b.getNumerador()+"/"+b.getDenominador()+" = "+num+"/"+den);
    }
    //Para el producto se multiplica numerador por numerador y denominador por denominador
    public void producto(Racional b){
        int num = (getNumerador()*b.getNumerador());
        int den = (getDenominador()*b.getDenominador());
        System.out.println(getNumerador()+"/"+getDenominador()+" x "+b.getNumerador()+"/"+b.getDenominador()+" = "+num+"/"+den);
    }
    //Para la division se multiplica numerador por denominador y denominador por numerador
    public void division(Racional b){
        int num = (getNumerador()*b.getDenominador());
        int den = (getDenominador()*b.getNumerador());
        System.out.println(getNumerador()+"/"+getDenominador()+" / "+b.getNumerador()+"/"+b.getDenominador()+" = "+num+"/"+den);
    }



    public static void main(String[] args) {
        //Creo los dos racionales
        Racional racional1=new Racional();
        Racional racional2=new Racional(3, 6);
        //Todos los metodos
        racional1.asignaNumerador(4);
        racional1.asignaDenominador(2);
        racional1.imprimirRacional();
        racional1.suma(racional2);
        racional1.resta(racional2);
        racional1.producto(racional2);
        racional1.division(racional2);
        
    }


}
