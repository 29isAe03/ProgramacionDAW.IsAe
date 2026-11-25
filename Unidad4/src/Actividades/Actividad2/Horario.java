package Actividades.Actividad2;

import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String[] Lunes={"Entornos","Entornos","BD","Recreo","Sistemas","Sistemas","Programación"};
        String[] Martes={"Sistemas","Digitalización","IPPE","Recreo","Sostenibilidad","Programación","Programación"};
        String[] Miercoles={"Programación","Programación","IPPE","Recreo","BD","BD","Programación"};
        String[] Jueves={"LM","LM","BD","Recreo","BD","Programación","Programación"};
        String[] Viernes={"Sistemas","Sistemas","BD","Recreo","Entornos","Entornos","IPPE"};

        System.out.println("Horario:");
        System.out.print("Lunes: ");
        for(int i=0;i<Lunes.length;i++){
            System.out.print(Lunes[i]+", ");
        }
        System.out.println();
        System.out.print("Martes: ");
        for(int i=0;i<Martes.length;i++){
            System.out.print(Martes[i]+", ");
        }
        System.out.println();
        System.out.print("Miercoles: ");
        for(int i=0;i<Miercoles.length;i++){
            System.out.print(Miercoles[i]+", ");
        }
        System.out.println();
        System.out.print("Jueves: ");
        for(int i=0;i<Jueves.length;i++){
            System.out.print(Jueves[i]+", ");
        }
        System.out.println();
        System.out.print("Viernes: ");
        for(int i=0;i<Viernes.length;i++){
            System.out.print(Viernes[i]+", ");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.print("Dia: ");
        int dia=teclado.nextInt();
        switch(dia){
            case 1: for(int i=0;i<Lunes.length;i++){
                       System.out.print(Lunes[i]+", ");
                    }
                    break;
            case 2: for(int i=0;i<Martes.length;i++){
                       System.out.print(Martes[i]+", ");
                    }
                    break;
            case 3: for(int i=0;i<Miercoles.length;i++){
                       System.out.print(Miercoles[i]+", ");
                    }
                    break;
            case 4: for(int i=0;i<Jueves.length;i++){
                       System.out.print(Jueves[i]+", ");
                    }
                    break;
            case 5: for(int i=0;i<Viernes.length;i++){
                       System.out.print(Viernes[i]+", ");
                    }
                    break;
            default: System.out.println("Dia incorrecto");
        }
    }
}
