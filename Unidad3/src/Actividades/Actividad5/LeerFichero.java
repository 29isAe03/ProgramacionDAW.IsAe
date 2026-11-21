package Actividades.Actividad5;

import java.io.File;
import java.util.Scanner;

public class LeerFichero {
    public static void main(String[] args) {
        
    
    try{
        Scanner leer = new Scanner(new File("./Unidad3/src/Actividades/Actividad5/FicheroEjemplo.txt"));
        String linea;
        int contador1=1;
        while(leer.hasNextLine()){
            linea=leer.nextLine();
            Scanner sc = new Scanner(linea);//Procesar la línea leída
            sc.useDelimiter("[,\\s]+");
            double suma=0;
            int contador=0;
            while(sc.hasNextDouble()){
                double nota= sc.nextDouble();
                suma=suma+nota;
                contador++;
            }
            double media=suma/contador;
            System.out.println("La media del grupo "+contador1+" es: "+media);
            contador1++;
        }
        leer.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
