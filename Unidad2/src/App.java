import java.time.LocalDateTime;
import java.util.Scanner;
import Utilidades.Matematicas;

/**
 * @author Domingo López Oller
 * @version 1.0
 * App: Primer codigo
 */
// public class App {

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
       
    //     LocalDateTime hoy = LocalDateTime.now();
    //     System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
    //     System.out.println("El día es: " + hoy.getDayOfMonth());
    //     System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
    //     System.out.println("El año es: " + hoy.getYear());
    //     System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

    //     System.out.println(Math.pow(2, 5));

    //     int max=15;
    //     int min=1;
    //     char letra='b';
    //     double aleatorio=(int)(Math.random()*(max-min+1)+min);
    //     System.out.println((char)(letra+aleatorio));
    // }
   
    //CLASE 3
    //Utilizar las funciones sumar y multiplicar de la clase Matemáticas
    // int numero1=3;
    // int numero2=5;
    // System.out.println("La suma es: "+Matematicas.sumar(numero1, numero2));
    // System.out.println("La multiplicación es: "+Matematicas.multiplicar(numero1, numero2));

    // System.out.println("El resto de la division 5/2 es:"+(5%2));
    // int variable=2;
    // System.out.println("La variable vale: "+variable);
    // variable++; //Variable=variable+1
    // System.out.println("La variable vale: "+variable);

    // int valor1=3;
    // int valor2=5;
    // valor1+=valor2; 

    //Condiciones If-Else
    // int numero=3;
    // int numero2=5;
    // int resultado;
    // if(numero>numero2){
    //     //Si se cumple hára esto
    //     resultado=numero+numero2;
    // }
    // else{
    //    //Sino se cumple hará esto
    //    resultado=numero-numero2;
    // }
    // System.out.println(numero+" "+numero2+" "+resultado);
    // //Usando el poerador ternario
    // resultado=(numero>numero2) ? numero+numero2:numero-numero2;
    // System.out.println("Por aquí voy");
    // System.out.println(numero+" "+numero2+" "+resultado);

    // int dia=2;

    // if(dia==1){
    //     System.out.println("Hoy es lunes");
    // }
    // else if(dia==2){
    //     System.out.println("Hoy es martes");
    // }
    // else if(dia==3){
    //     System.out.println("Hoy es miercoles");
    // }
    // else if(dia==4){
    //     System.out.println("Hoy es jueves");
    // }
    // else if(dia==5){
    //     System.out.println("Hoy es viernes");
    // }
    // else if(dia==6){
    //     System.out.println("Hoy es sabado");
    // }
    // else if(dia==7){
    //     System.out.println("Hoy es domingo");
    // }
    
    // //Switch
    // int valor=3;
    // switch(valor){
    //     case 1: System.out.println("Lunes");
    //     case 2: System.out.println("Martes");
    //     case 3: System.out.println("Miercoles");
    //     case 4: System.out.println("Jueves");
    //     case 5: System.out.println("Vieres");
    //     case 6: System.out.println("Sabado");
    //     case 7: System.out.println("Domingo");
    //     default: System.out.println("Incorrecto");

    int numero=4;
    System.out.println((int)(Matematicas.raiz(numero)));
    

    

}

    
