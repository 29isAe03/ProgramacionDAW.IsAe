import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author Domingo López Oller
 * @version 1.0
 * App: Primer codigo
 */
public class App {

    /**
     * Función main para ejecutar código java
     * @param args es un argumento
     */
    public static void main(String[] args) {
        // double edad;
        // edad=400000;
        // boolean logico=(8<9);
        // String caracter="Domingo";

        // System.out.println("Hola mundo");
        // System.out.println(edad);
        // System.out.println(logico);

        // int numerador = (1+2+3+1);
        // double denominador=3;
        // System.out.println((1+2+3+1)/3);
        // System.out.println((1+2+3+1)/3.0);
        // System.out.println(numerador/denominador);

        // int a='A';
        // System.out.println(a);

        // int[]b={4, 0, -1};
        // System.out.println(b);
        // System.out.println(b[2]);
        // a='c';

        // final int VALOR;
        // VALOR=5;

        // int variable=0;
        // System.out.println(variable);
        // //Declarar varias variables en una línea
        // int uno=1,dos=2,tres=3;

        // /*
        // Este párrafo es un comentario
        // diadisad
        // dasdadasd
        // dsadasdas
        // */

        // System.out.println("====================================");
        // System.out.println("   Hola mundillo  ");
        // System.out.println("====================================");

        //CLASE 2

        // Scanner sc=new Scanner(System.in); //Introducir valor por teclado
        // int numero;

        // System.out.println("Introduce un número");
        // numero=Integer.parseInt(sc.nextInt()); 
        // System.out.println("Introduce nombre");
        // String nombre=sc.nextLine();
        // System.out.println("El numero es: "+numero" y tu nombre es "+nombre" ");
       
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
        System.out.println("El día es: " + hoy.getDayOfMonth());
        System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
        System.out.println("El año es: " + hoy.getYear());
        System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        System.out.println(Math.pow(2, 5));

        int max=15;
        int min=1;
        char letra='b';
        double aleatorio=(int)(Math.random()*(max-min+1)+min);
        System.out.println((char)(letra+aleatorio));
    }
   
}
