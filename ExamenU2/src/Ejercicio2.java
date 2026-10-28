import java.util.Scanner;

public class Ejercicio2 {
    public static int jugador(){
        Scanner sc=new Scanner(System.in);
        //Hago que pida la jugada
        System.out.println("Diga su jugada(1-piedra, 2-papel, 3-tijera): ");
        int jugador=sc.nextInt();
        //Devolvera el valor de la jugada
        return jugador;
    }
    public static int maquina(){
        //Generara aleatoriamente entre este rango un valor que es un jugada
        int max=3;
        int min=1;
        int maquina=(int)(Math.random()*(max-min+1)+min);
        return maquina;
    }

    public static void ejercicio(){
                Scanner sc=new Scanner(System.in);
        int jugador;
        int maquina;
        int contador=0;
        //Creo una variable para cada jugador y una para el contador de victorias de la maquina
        do{
          //Uso las funciones
          jugador=jugador();
          maquina=maquina();
          //Con if else creo que todas las posibilidades
          if(jugador==1 && maquina==1){
            System.out.println("Piedra vs Piedra");
            System.out.println("Empate");
          }
          else if(jugador==1 && maquina==2){
            System.out.println("Piedra vs Papel");
            System.out.println("La maquina gana");
            contador++;
          }
          else if(jugador==1 && maquina==3){
            System.out.println("Piedra vs Tijeras");
            System.out.println("Has ganado!");
          }
          else if(jugador==2 && maquina==1){
            System.out.println("Papel vs Piedra");
            System.out.println("Has ganado!");
          }
          else if(jugador==2 && maquina==2){
            System.out.println("Papel vs Papel");
            System.out.println("Empate");
          }
          else if(jugador==2 && maquina==3){
            System.out.println("Papel vs Tijera");
            System.out.println("La maquina ha ganado");
            contador++;
          }
          else if(jugador==3 && maquina==1){
            System.out.println("Tijera vs Piedra");
            System.out.println("La maquina ha ganado");
            contador++;
          }
          else if(jugador==3 && maquina==2){
            System.out.println("Tijera vs Papel");
            System.out.println("Has ganado!");
          }
          else if(jugador==3 && maquina==3){
            System.out.println("Tijera vs Tijera");
            System.out.println("Empate");
          }


        }while(jugador!=-1 && contador<5);
    }
    public static void main(String[] args) {
        ejercicio();
    }
}
