package Ejercicios.Ejercicio8;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo el objeto
        Persona persona1=new Persona();
        try{
            //les doy el fichero de donde sacar la informacion
            Scanner leer = new Scanner(new File("./Unidad3/src/Ejercicios/Ejercicio8/Leer.txt"));
            String linea;
            //Que lea todas las lineas
            while(leer.hasNextLine()){
                linea=leer.nextLine();
                Scanner sc = new Scanner(linea);//Procesar la línea leída
                //Pongo el lmititador de 
                sc.useDelimiter("[;\\s]+");
                //Asocio un atributo de la clase
                persona1.setNombre(sc.next());
                persona1.setEdad(sc.nextInt());
                persona1.setTelefono(sc.nextInt());
                persona1.setPoblacion(sc.next());

                persona1.imprimirPersona();
        
            }
            leer.close();
            //Que imprima los datos
            
        }catch(Exception e){
             System.out.println(e.getMessage());
 
        }
    }
}
