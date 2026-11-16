package Ejercicios.Ejercicio4;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class CopiarFichero {
    public static void main(String[] args) {
        
    
       try{
           Scanner teclado= new Scanner(System.in);


           System.out.println("Inserte ruta del primer fichero: ");
           File ficheroPrimero=new File(teclado.nextLine());
           Scanner fichero1=new Scanner(ficheroPrimero);
           System.out.println("Inserte ruta del segundo fichero: ");
           File ficheroSegundo=new File(teclado.nextLine());
           Scanner fichero2=new Scanner(ficheroSegundo);
           String nombreSalida=ficheroPrimero.getName()+"_"+ficheroSegundo.getName();
           File ficheroSalida= new File(nombreSalida);
           PrintWriter ficheroSalidaEscribir= new PrintWriter(ficheroSalida);


           while(fichero1.hasNextLine()){
               String linea=fichero1.nextLine();
               ficheroSalidaEscribir.println(linea);
           }
           while(fichero2.hasNextLine()){
               String linea=fichero2.nextLine();
               ficheroSalidaEscribir.println(linea);
           }
           teclado.close();
           fichero1.close();
           fichero2.close();
           ficheroSalidaEscribir.close();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}