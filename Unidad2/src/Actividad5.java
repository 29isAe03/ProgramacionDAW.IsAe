public class Actividad5 {
    final static double PI=3.14159;

    public static void calcularArea(double altura,double radio){
       double area=2*PI*(altura+radio);
       System.out.println("El área del cilindro es: "+area);


    }
    public static void calcularVolumen(double altura, double radio){
        double volumen=2*PI*(altura+radio);
        System.out.println("El volumen del cilindro es: "+volumen);
    }
    public static void main(String[] args) {
        calcularArea(2,3);;
    }
}
