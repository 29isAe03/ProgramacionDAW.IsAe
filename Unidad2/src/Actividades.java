import java.util.Scanner;

public class Actividades {
    public static void actividad1(){ //Calculo con numeros aleatorios
        //Creo el rango de los numeros
        int max=100;
        int min=1;
        //Hago que genere un aletorio entero entre el rango
        double aleatorio1=(int)(Math.random()*(max-min+1)+min);
        double aleatorio2=(int)(Math.random()*(max-min+1)+min);
        //Hago que escriba todas las cuentas
        System.out.println("Los numeros son: "+aleatorio1+" y "+aleatorio2);
        System.out.println("El cociente es: "+aleatorio1/aleatorio2);
        System.out.println("La media es: "+(aleatorio1+aleatorio2)/2);
        System.out.println("La potencia es: "+Math.pow(aleatorio1, aleatorio2));
        System.out.println("Las raices son: "+Math.sqrt(aleatorio1)+" y "+Math.sqrt(aleatorio2));

    }
    public static void actividad2(){ //Ecuación de segundo grado
        Scanner sc=new Scanner(System.in);
        //Hago que pida los coeficientes de la ecuación
        System.out.println("Diga los coeficientes: ");
        int principal=sc.nextInt(); sc.nextLine();
        int lineal=sc.nextInt(); sc.nextLine();
        int independiente=sc.nextInt();
        //Creo el discriminante 
        int delta=((lineal*lineal)-4*principal*independiente);
        //Veo los casos segun el resultado del discriminante
        if(delta<0){
            //Si el discriminante es menor que 0, no hay soluciones
            System.out.println("No hay soluciones");
        }
        else{
            //Si es 0, habra solo una solucion
            if(delta==0){
                int solucion1=((-lineal)/2*principal);
                System.out.println("La unica solución es: "+solucion1);
            }
            else{
                //Si es mayor que 0, entonces habra 2 soluciones
                double solucion1=(((-lineal)+Math.sqrt(delta))/(2*principal));
                double solucion2=(((-lineal)-Math.sqrt(delta))/(2*principal));

                System.out.println("Las soluciones son: "+solucion1+" y "+solucion2);
            }
        }
    }
    public static void actividad3version1(){ //Calificación nota con if else
        Scanner sc=new Scanner(System.in);
        //Hago que pida la nota
        System.out.print("Diga la nota:");
        int nota=sc.nextInt();
        //Hago un caso por cada nota
        if(nota<5){
            System.out.println("Suspenso");
        }
        else if(nota==5){
            System.out.println("Aprobado");
        }
        else if(nota==6){
            System.out.println("Bien");
        }
        else if(nota==7 || nota==8){
            System.out.println("Notable");
        }
        else if(nota==9 || nota==10){
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Nota invalida");
        }
        

    }
    public static void actividad3version2(){ //Calificación nota con switch
        Scanner sc=new Scanner(System.in);
        //Hago que te pida la nota
        System.out.print("Diga la nota:");
        int nota=sc.nextInt();
        //Con un switch hago un caso para cada nota
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("Suspenso"); break;
            case 5: System.out.println("Aprobado"); break;
            case 6: System.out.println("Bien"); break;
            case 7:
            case 8: System.out.println("Notable"); break;
            case 9:
            case 10: System.out.println("Sobresaliente"); break;
       
        
        }
    }
    public static void actividad4(){ //Verificador de fechas
        Scanner sc =new Scanner(System.in);
        //Hago que pida el dia, mes y año
        System.out.println("Introuce el dia, mes y año: ");
        int dia=sc.nextInt(); sc.nextLine();
        int mes=sc.nextInt(); sc.nextLine();
        int anio=sc.nextInt(); 
        //Solo hay 31 dias por mes como maximo y 12 meses en todos los años
        if((dia>0 && dia <=31) && (mes>0 && mes <=12)){
            //Veo si es bisiesto
            if(dia==29 && mes==2){ 
                if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
                    System.out.println("La fecha es correcta");    
                }
                else{
                    System.out.println("La fecha es incorrecta");        
                }
            } 
            else{
                System.out.println("La fecha es correcta");
            }
        }
        else{
            System.out.println("La fecha es incorrecta");
        }
    }
    public static void actividad5(){ //Multiplos entre 50 y 200
        //Solo creo un bucle que llegue de 50 a 200
        for(int i=50; i<=200; i++){
            //Hago que escriba el numero si es multiplo de 2 y 3
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
            else{}
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Diga el numero: ");
        int numero=sc.nextInt();
        int factorial=1;
        for(int i=numero; i>=1;i--){
           factorial=factorial*i;
        }
        System.out.println(factorial);
    }
   


}
