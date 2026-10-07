import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicios {
    public void ejercicio1(){
        LocalDateTime hoy = LocalDateTime.now();
        int hora=(hoy.getHour());
        if(hora>=6 || hora<=12 ){
            System.out.println("Buenos dias!");
        }
        else if(hora>=13 || hora<=20){
            System.out.println("Buenas tardes!");
        }
        else if(hora>=21||hora<=5 ){
            System.out.println("Buenas noches!");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Diga las horas trabajadas:");
        int horas= sc.nextInt();
        int dinero=0;
        if(horas<40){
         dinero=(horas*12);
        }
        else if(horas>40){
            do{
                dinero=dinero+12;
            }
            while(horas<40);
            for(int i=0;i==horas;i++){
                dinero=dinero+16;
            }
        }
        System.out.println("Ha ganado "+dinero+" euros");
    }
}
