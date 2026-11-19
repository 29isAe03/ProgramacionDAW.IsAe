package Actividades.Actividad1;

public class CuentaCorriente {
    //Atributos
    private Persona persona;
    private int numero;
    private double saldo;

    //Constructores

    public CuentaCorriente(){}

    public CuentaCorriente(Persona persona, int numero, double saldo){
        this.persona=persona;
        this.numero=numero;
        this.saldo=saldo;
    }

    public CuentaCorriente(CuentaCorriente copia){}

    //Metodos

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirCuenta(){
        System.out.println("Persona: "+getPersona().getNombre());
        System.out.println("Nuemro de Cuenta: "+getNumero());
        System.out.println("Saldo: "+getSaldo());
    }

    
}
