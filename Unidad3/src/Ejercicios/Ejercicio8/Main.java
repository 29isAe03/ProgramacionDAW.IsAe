package Ejercicios.Ejercicio8;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        try{
            Scanner leer = new Scanner(new File("./Unidad3/src/Ejercicios/Ejercicio8/Leer.txt"));
            String linea;
            while(leer.hasNextLine()){
                linea=leer.nextLine();
                System.out.println(linea);
                Scanner sc = new Scanner(linea);//Procesar la línea leída
                sc.useDelimiter("[;\\s]+");
                persona1.setNombre(sc.nextLine());
                persona1.setEdad(sc.nextInt());
                persona1.setTelefono(sc.nextInt());
                persona1.setPoblacion(sc.nextLine());
        
            }
            leer.close();
            persona1.imprimirPersona();
        }catch(Exception e){
             System.out.println(e.getMessage());
 
        }
    }
}
