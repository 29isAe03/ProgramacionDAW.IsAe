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
        System.out.println("Diga el numero");
        int numero=sc.nextInt();
        int factorial=1;
        for(int i=1; i<=numero; i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

        
        
    }
}
