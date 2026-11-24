package Actividades.Actividad1;

import java.util.Scanner;

public class Busqueda {

    public static int posicion(int[] vector, int numero){
        int encontrado=-1;
       for(int i=0;i<vector.length;i++){
        if(vector[i]==numero){
            encontrado=1;
        }
        }
        return encontrado;
       
    }

     public static int posicion2(int[] vector, int numero){
        int encontrado=-1;
       for(int i=0;i<vector.length;i++){
        if(vector[i]==numero){
            encontrado=i;
            break;
        }
        }
        return encontrado;
       
    }
    public static void main(String[] args) {
        int[] array={3,4,2,4,2};
        System.out.println(posicion2(array, 2));
        
        
    }
}
