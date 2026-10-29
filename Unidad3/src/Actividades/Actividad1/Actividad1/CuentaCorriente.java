package Actividades.Actividad1.Actividad1;

public class CuentaCorriente {
    //Atributos
    Persona titular;
    int numeroCuenta;
    int saldo;
        
    //Constructores
    public CuentaCorriente(){

    }


    public CuentaCorriente(Persona persona, int numeroCuenta, int saldo){
        this.titular=persona;
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

    public void mostrarInfo(){
        System.out.println("Titular: "+titular.getNombre());
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Numero de cuenta: "+this.numeroCuenta);
    }






    
    public static void main(String[] args) {
        Persona persona=new Persona("Juan", "676767X", "29/02/1999", "mi casa", "F", "Casado");
        CuentaCorriente cuenta1=new CuentaCorriente(persona, 67, 45);
        cuenta1.mostrarInfo();
        
    }




}
