public class Actividad {
 public static void actividad1(){}
    public static void main(String[] args) {

        //Creo el rango de los números
        int max=100;
        int min=1;

        //Hago que los números sean aleatorios en ese rango
        double numero1=(int)(Math.random()*(max-min+1)+min);
        double numero2=(int)(Math.random()*(max-min+1)+min);

        //Pongo que diga los números
        System.out.println("Primer número es: "+numero1);
        System.out.println("Segundo número es: "+numero2);

        //Hago que diga el cociente y la media de forma simple
        System.out.println("El cociente es: "+numero1/numero2);
        System.out.println("La media es: "+(numero1+numero2)/2);

        //Para la potencia y la raiz creo una variable con el resultado usando el Math.
        double potencia=(Double)(Math.pow(numero1, numero2));
        double raiz1=(Double)(Math.sqrt(numero1));
        double raiz2=(Double)(Math.sqrt(numero2));

        //Ahora hago que proyecte cada resultado
        System.out.println("La potencia es: "+potencia);
        System.out.println("La raíz del primer número es:" +raiz1);
        System.out.println("La raíz del segundo número es: " +raiz2);
    }


}
