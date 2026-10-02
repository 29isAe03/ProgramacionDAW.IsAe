import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // for(int i=50;i<=200;i++){
        //     if (i%2==0 && i%3==0) {
        //         System.out.println(i);
        //     }
        //     else{

        //     }
        // }
        // System.out.println("Diga el numero");
        // int numero=sc.nextInt();
        // int factorial=1;
        // for(int i=1; i<=numero; i++){
        //     factorial=factorial*i;
        // }
        // System.out.println(factorial);

        // int contador=0;
        // int alumnos=0;
        // int suma=0;
        // int maximo=0;
        // int minimo=0;
        // int numero=0;
        // System.out.println("Escribe las edades");
        // do{
        //     numero=sc.nextInt(); sc.nextLine();
        //     if(contador==0){
        //         minimo=numero;
        //         maximo=numero;
        //         contador++;
        //         alumnos++;

        //     }
        //     else if((minimo>numero) && (numero!=-1)){
        //         minimo=numero;
        //         alumnos++;
                
        //     }
        //     else if(maximo<numero){
        //         maximo=numero;
        //         alumnos++;
        //     }
            
            
        // }
        // while(numero!=-1);
        // System.out.println("Maximo es: "+maximo+" y Minimo es: "+minimo);
        // System.out.println("El numero de alumnos es: "+alumnos);


        int max=100;
        int min=1;
        int contador=0;
        int numero=(int)(Math.random()*(max-min+1)+min);
        int intento=0;
        System.out.println("Adivina el numero: ");
        do{
            intento=sc.nextInt(); sc.nextLine();
            if(intento<numero){
                System.out.println("Incorrecto, el numero es mas grande, intenta de nuevo");
                contador++;
            }
            else if(intento>numero){
                System.out.println("Incorrecto, el numero es mas peño, intenta de nuevo");
                contador++;
            }
        }
        while(intento!=numero);
        if(intento==numero){
            System.out.println("Numero correcto!");
            contador++;
        }
        System.out.println("Nºintentos: "+contador);


        
        
    }
}
