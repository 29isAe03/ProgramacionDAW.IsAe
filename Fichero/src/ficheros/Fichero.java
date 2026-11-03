import java.io.File;

public class Fichero{

    public static void main(String[] args) {
        File fichero=new File("FicheroEjemplo.txt");

        if(fichero.exists()){
            System.out.println("Nombre del archivo: "+fichero.getName());
            System.out.println("Ruta: "+fichero.getPath());
            System.out.println("RUta absoluta: "+fichero.getAbsolutePath());
            System.out.println("Se puede escribir: "+fichero.canWrite());
            System.out.println("Se puede leer: "+fichero.canRead());
            System.out.println("Tamaño del archivo: "+fichero.length());
        }
    }
}