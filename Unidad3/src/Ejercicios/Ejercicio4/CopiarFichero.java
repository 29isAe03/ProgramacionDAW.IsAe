package Ejercicios.Ejercicio4;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class CopiarFichero {
    public static void main(String[] args) {
        
    
       try{
           //Creo el objeto para que detecte la entrada por teclado para poner los ficheros que queremos copair
           Scanner teclado= new Scanner(System.in);

           //Pide el primer fichero 
           System.out.println("Inserte ruta del primer fichero: ");
           File ficheroPrimero=new File(teclado.nextLine());
           Scanner fichero1=new Scanner(ficheroPrimero);
           //Pide el segundo fichero
           System.out.println("Inserte ruta del segundo fichero: ");
           File ficheroSegundo=new File(teclado.nextLine());
           Scanner fichero2=new Scanner(ficheroSegundo);
           //Pide el segundo fichero
           String nombreSalida=ficheroPrimero.getName()+"_"+ficheroSegundo.getName();
           //Le pongo nombre al fichero creado y que se cree en la misma carpeta que los otros dos
           PrintWriter ficheroSalidaEscribir=new PrintWriter("./Unidad3/src/Ejercicios/Ejercicio4/"+nombreSalida);

           //Lee y copia lo que pone en los otros ficheros
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