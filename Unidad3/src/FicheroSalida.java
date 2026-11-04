import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroSalida {
    public static void main(String[] args) {
        String contenido="Este es un ejemplo de uso de PrintWriter en Java.";
        try{
            Scanner sc=new Scanner(System.in);
            String nombre=sc.nextLine();

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
