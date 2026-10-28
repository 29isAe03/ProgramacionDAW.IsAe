import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Hago que pida los numeros
        System.out.println("Diga numeros positivos: ");
        int numeroPositivo;
        //Que pida los numeros hasta que se escriba 0
        do{
            numeroPositivo=sc.nextInt(); sc.nextLine();
            //Si el numero es menor que 0, que salte un error
             try {
                    
            } catch (Exception e) {
                System.out.println("Error, has introducido un numero negativo");
            }
                
            

        } while(numeroPositivo!=0);
    } 
}
