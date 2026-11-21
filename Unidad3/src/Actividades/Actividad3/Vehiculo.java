package Actividades.Actividad3;

public class Vehiculo {
    //Atributos 
    private String marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;

    //Constructores

    public Vehiculo(){}

    public Vehiculo(String marca, String referencia, int modelo, String placa, String color, int valor){
        this.marca=marca;
        this.referencia=referencia;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
        this.valor=valor;
    }

    public Vehiculo(Vehiculo copia){}

    //metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimirVehiculo(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Referencia: "+getReferencia());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Color: "+getColor());
        System.out.println("Valor: "+getValor());
    }

    
}
