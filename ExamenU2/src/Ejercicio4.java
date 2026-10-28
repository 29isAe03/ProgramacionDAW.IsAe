import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio(){
                Scanner sc=new Scanner(System.in);
        System.out.println("Tabla 1?");
        boolean tabla=sc.nextBoolean();
        if(tabla==true){
            //Si el resultado es true, que muestre la primera tabla
            System.out.println("| | | | | | | |");
            System.out.println("| | | | | | | |");
            System.out.println("| | |x| | | | |");
            System.out.println("| | |o|x| | | |");
            System.out.println("| |x|o|o| | | |");
            System.out.println("|x|o|x|o|x| | |");
            System.out.println("---------------");
            System.out.println(" 0 1 2 3 4 5 6");
        }
        else{
            //Si no es asi, que muestre la segunda
            System.out.println("|x|o|x|");
            System.out.println("| |o| |");
            System.out.println("| |x| |");
            System.out.println("-------");
            System.out.println(" 0 1 2");
        }
    }
    public static void main(String[] args) {
       ejercicio();
    }
}
