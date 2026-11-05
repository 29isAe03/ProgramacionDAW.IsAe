import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Actividadtexto {
        public static void main(String[] args) {
        try{
            // File fichero = new File("./Unidad3/src/ActividadTexto.txt");
            // String palabra=sc.next();
            // Scanner teclado=new Scanner(System.in);

            // System.out.println("Di la palabra que buscas");
            // String palabraBuscada = teclado.next();

            // int contador=0;

            // while(sc.hasNextLine()){
            //     String linea =sc.nextLine();
            //     System.out.println(linea);
            //     Scanner scLinea=new Scanner(linea);
            //     scLinea.useDelimiter("[,\\s]+");

            //     while(scLinea.hasNext()){
            //         String palabra=scLinea.next();

            //         if(palabra.equalsIgnoreCase(palabraBuscada)){
            //             contador++;
            //         }
            //     }


            // }
            // System.out.println("La palabra se repite "+contador+" veces");

              
            Scanner ficheroLeer = new Scanner("./Unidad3/src/ficheroLeer.txt");

            PrintWriter ficheroEscribir= new PrintWriter("./Unidad3/src/ficheroEscribir.txt");


            while(ficheroLeer.hasNextLine()){
                String linea=ficheroLeer.nextLine();
                ficheroEscribir.println(linea);
            }
            ficheroLeer.close();
            ficheroEscribir.close();

            

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
  
    }
}
