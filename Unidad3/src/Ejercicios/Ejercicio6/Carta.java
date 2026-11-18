package Ejercicios.Ejercicio6;

public class Carta {
    //Atributos
    private Palos palo;
    private int valor;

    //Constructores
    
    public Carta(){
        palo.setValor(0);
        valor=0;
    }

    public Carta(Palos palo, int valor){
        this.palo=palo;
        this.valor=valor;
    }

    public Carta(Carta copia){}

    //Metodos

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   
    //Procedimiento que imprima la informacion

    public void imprimirCarta(){
        System.out.println("Palo: "+getPalo().getNombre());
        System.out.println("Valor: "+getValor());
    }
}
