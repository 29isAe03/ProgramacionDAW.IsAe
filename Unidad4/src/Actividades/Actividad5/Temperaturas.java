package Actividades.Actividad5;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String[] localidades={"Almeria","Huercal-Overa","Murcia","Lorca"};
        String[] dias={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int[][] temperaturas={
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0}
        };
        int suma=0;
        int contadorLocalidades;
        int contadorDias;
        int accion;
        do{
            System.out.println("1-Ingresar Temperaturas    2-Mostrar temperaturas");
            System.out.println("3-Media xLocalidad          4-Media xDia");
            System.out.println("5-Temperatura maxmima y minima     6-Localidad con temperatura mas alta");
            System.out.println("7-Dia con temperatura mas alta       -1-Cerrar");
            accion=teclado.nextInt(); teclado.nextLine();

            switch(accion){
                case 1: for(int i=0;i<temperaturas.length;i++){
                    System.out.println("Temperaturas de "+localidades[i]);
                    for(int j=0;j<temperaturas[i].length;j++){
                        System.out.print("Dia "+dias[j]+": ");
                        temperaturas[i][j]=teclado.nextInt(); teclado.nextLine();
                    }
                    
                } break;
                case 2: for(int i=0;i<temperaturas.length;i++){
                    System.out.println(localidades[i]);
                    for(int j=0;j<temperaturas[i].length;j++){
                        System.out.println(" "+dias[j]+": "+temperaturas[i][j]+" ");
                    }
                    System.out.println();
                } break;
                case 3: for(int i=0;i<temperaturas.length;i++){
                    System.out.println(localidades[i]);
                    suma=0;
                    for(int j=0;j<temperaturas[i].length;j++){
                        suma=suma+temperaturas[i][j];
                    }
                    System.out.println(suma/7);
                } break;
                case 4: for(int i=0;i<temperaturas.length;i++){
                    System.out.println(dias[i]);
                    suma=0;
                    for(int j=0;j<temperaturas[i].length;j++){
                        suma=suma+temperaturas[j][i];
                        
                    }
                    System.out.println(suma/4);
                }
            }
        } while(accion!=-1);
    }
}
