package Actividades.Actividad1.Actividad2;

public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;

    //Constructores
    public Fecha(){}

    public Fecha (int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public Fecha(Fecha copia){}

    //Metodos

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirFecha(){
        System.out.println("Dia: "+getDia());
        System.out.println("Mes: "+getMes());
        System.out.println("Año: "+getAnio());
    }
}
