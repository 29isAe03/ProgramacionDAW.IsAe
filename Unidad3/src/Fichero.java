import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Fichero{

    public static void main(String[] args) {
        // try{
        //     BufferedReader leer =new BufferedReader(new FileReader("./Unidad3/src/Unidad3.java"));
        //     String linea;
        //     while((linea=leer.readLine())!=null){
        //         System.out.println(linea);
        //     }
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }


        try{
            Scanner leer = new Scanner(new File("./Unidad3/src/Unidad3.java"));
            String linea;
            while(leer.hasNextLine()){
                System.out.println(leer.nextLine());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
 
    }
}
