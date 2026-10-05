import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        //MCD
        Scanner sc=new Scanner(System.in);
        // int numero1=0;
        // int numero2=0;
        // int mayor=0;
        // int mcm=0;
        // int resto=0;
        // System.out.println("Introduce el primer número");
        // numero1=sc.nextInt(); sc.nextLine();
        // System.out.println("Introduce el segundo número");
        // numero2=sc.nextInt();
        // numero1=Math.abs(numero1);
        // numero2=Math.abs(numero2);

        // while(numero2!=0){
        //     resto=(numero1%numero2);
        //     numero1=numero2;
        //     numero2=resto;
        // }
        // System.out.println("El MCD es: "+numero1);
        //MCM
        System.out.println("Introduce el primer número");
        int numero1=0;
        int numero2=0;
        int mayor;
        int mcm;
        numero1=sc.nextInt(); sc.nextLine();
        System.out.println("Introduce el segundo número");
        numero2=sc.nextInt();
        
        numero1=Math.abs(numero1);
        numero2=Math.abs(numero2);

        mayor=Math.max(numero1, numero2);
        mcm=mayor;

        while (((mcm%numero1)!=0) || ((mcm%numero2)!=0)) {
            mcm=mcm+mayor;
        }
        System.out.println("El mcm es: "+mcm);

    }
}
