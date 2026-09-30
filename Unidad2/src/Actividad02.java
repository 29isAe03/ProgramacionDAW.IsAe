import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la nota: ");
        int nota=sc.nextInt();

        // if(nota<5){
        //     System.out.println("Suspenso");
        // }
        // else if(nota==5){
        //     System.out.println("Aprobado");
        // }
        // else if(nota==6){
        //     System.out.println("Bien");
        // }
        // else if(nota==7 || nota==8){
        //     System.out.println("Notable");
        // }
        // else if(nota==9 || nota==10){
        //     System.out.print("Sobresaliente");
        // }
        // else{
        //     System.out.println("Nota invalida");
        // }

        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota invalida");
                break;
        }

    }
}
