import java.util.Scanner;

public class Actividad002 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Diga dia");
         int dia=sc.nextInt();
         System.out.println("Diga mes");
         int mes=sc.nextInt();
         System.out.println("Diga año");
         int anio=sc.nextInt();

         if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            if (mes==2) {
                if (dia<=29) {
                    System.out.println("Fecha correcta, es año bisiesto");
                }
                else{
                    System.out.println("Fecha incorrecta");
                }
                
            }
           else{
           }

         }
         else{
            
         }
    }
}
