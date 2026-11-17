package Ejercicios.Ejercicio6;

public class Carta {
    //Atributos
    private String palo;
    private int valor;

    //Constructores
    
    public Carta(){
        palo="";
        valor=0;
    }

    public Carta(String palo, int valor){
        this.palo=palo;
        this.valor=valor;
    }

    public Carta(Carta copia){}

    //Metodos

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
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
        System.out.println("Palo: "+getPalo());
        System.out.println("Valor: "+getValor());
    }
}
