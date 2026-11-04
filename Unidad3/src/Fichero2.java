import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero2 {
    public static void leerDatos(String Ruta){
    int partidasJugador1=0;
    int partidasJugador2=0;
    int partidasJugador3=0;
    int partidasJugador4=0;

    try {
        Scanner sc = new Scanner(new File(Ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
        while (sc.hasNextLine()) {
            String linea = sc.nextLine(); //Lectura de toda la línea
            Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
            String jugador = scLinea.next();
            int partidas = scLinea.nextInt();
            if (jugador.equals("jugador1")) { //Compruebo si he leído jugador1
                partidasJugador1 = partidas;
            } else if (jugador.equals("jugador2")) {
                partidasJugador2 = partidas;
            } else if(jugador.equals("jugador3")) {
                partidasJugador3 = partidas;
            } else if(jugador.equals("jugador4")) {
                partidasJugador4 = partidas;
            }
            scLinea.close();
        }
        System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3+"-"+partidasJugador3);
        sc.close();

    } catch (FileNotFoundException e) {
        System.out.println("No se encuentra el fichero.");
    }
}  
    public static void main(String[] args) {
        leerDatos("./Unidad3/src/FicheroEjemplo2.text");
    }




}
