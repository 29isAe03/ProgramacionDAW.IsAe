package Actividades.Actividad4;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int[] Notas={0,0,0,0,0,0,0,0,0,0};
        int Aprobados=0;
        int Suspensos=0;
        int contador=0;
        int suma=0;
        int maximo=0;
        int minimo=10;
        int accion=0;
        do{
        System.out.println("Notas de la clase");
        System.out.println("1: Insertar Notas    2: Mostrar Notas");
        System.out.println("3: Calcular Media    4: Nota mas alta y baja");
        System.out.println("5: Numero de aprobados y suspensos    -1: Cerrar");
        System.out.print("Accion: ");
        accion=teclado.nextInt(); teclado.nextLine();
        switch (accion) {
            case 1: for(int i=0;i<Notas.length;i++){
                Notas[i]=teclado.nextInt(); teclado.nextLine();
                if(Notas[i]>5){
                    Aprobados++;
                }
                if(Notas[i]<5){
                    Suspensos++;
                }
                if(Notas[i]>maximo){
                    maximo=Notas[i];
                }
                if(Notas[i]<minimo){
                    minimo=Notas[i];
                }
                suma=suma+Notas[i];
                contador++;
            } break;

            case 2: System.out.print("Notas: ");
            for(int i=0;i<Notas.length;i++){
                System.out.print(Notas[i]+", ");
            } break;

            case 3: System.out.println("La media es: "+suma/contador); break;

            case 4: System.out.println("Nota mas alta: "+maximo);
                    System.out.println("Nota mas baja: "+minimo); break;

            case 5: System.out.println("Aprobados: "+Aprobados);
                    System.out.println("Suspensos: "+Suspensos); break;
        }
        System.out.println("--------------");
    }while(accion!=-1);
    }
}
