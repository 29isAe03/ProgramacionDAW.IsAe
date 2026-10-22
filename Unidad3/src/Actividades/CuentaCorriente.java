package Actividades;
import Actividades.Persona;


public class CuentaCorriente {
    //Atributos
    Persona titular;
    int numeroCuenta;
    int saldo;
        
    //Constructores
    public CuentaCorriente(){

    }


    public CuentaCorriente(Persona titular, int numeroCuenta, int saldo){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

    //Metodos

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static void mostrarInfo(){
        Actividades.Persona.informacion();
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Numero de cuenta: "+this.numeroCuenta);
    }






    
    public static void main(String[] args) {
        Persona persona=new Persona();
        mostrarInfo();
    }




}
