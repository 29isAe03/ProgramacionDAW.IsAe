import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicios {
    public void ejercicio1(){
        //Pongo la libreria del tiempo
        LocalDateTime hoy = LocalDateTime.now();
        //Creo la variable hora que tenga la hora actual
        int hora=(hoy.getHour());
        //Pongo que ponga cada mensaje dependiendo de la hora
        if(hora>=6 || hora<=12 ){
            System.out.println("Buenos dias!");
        }
        else if(hora>=13 || hora<=20){
            System.out.println("Buenas tardes!");
        }
        else if(hora>=21||hora<=5 ){
            System.out.println("Buenas noches!");
        }
    }
    public void ejercicio2(){
        //Activo la libreria Scanner
        Scanner sc =new Scanner(System.in);
        System.out.print("Diga las horas trabajadas:");
        //Pongo para escribir las horas
        int horas= sc.nextInt();
        int dinero=0;
        //Hago que haga algun calculo dependiendo de la cantidad de horas
        if(horas<=40){
         dinero=(horas*12); //Si son menos de 40 horas, son 12 euros la hora
        }
        else{
            int contador=0; //Inicio un contador para que cuando llegue a 40 empiece a sumar 16 en vez de 12
            do{
                dinero=dinero+12;
                contador++;
            }
            while(contador<40);
            do{
                dinero=dinero+16;
                contador++;
            }
            while(contador>40 && contador<horas);

        }
        System.out.println("Ha ganado "+dinero+" euros");
    }
    public void actividad3(){
        //Abro Scanner
       Scanner sc=new Scanner(System.in);
       //Hago que tengas que escribir el dia y el mes
       System.out.print("Diga el dia: ");
       int dia= sc.nextInt(); sc.nextLine();
       System.out.print("Diga el mes: ");
       int mes= sc.nextInt();
       //Directamente hago un if con cada signo zodiacal

       if((mes==3 && (dia>=21 && dia<=31)) || (mes==4 && dia<=19)){
        System.out.println("Es aries");
       }
       else if((mes==4 && (dia>=20 && dia<=30)) || (mes==5 && dia<=20)){
        System.out.println("Es tauro");
       }
       else if((mes==5 && (dia>=21 && dia<=31)) || (mes==6 && dia<=20)){
        System.out.println("Es Géminis");
       }
       else if((mes==6 && (dia>=21 && dia<=30)) || (mes==7 && dia<=22)){
        System.out.println("Es Cancer");
       }
       else if((mes==7 && (dia>=23 && dia<=31)) || (mes==8 && dia<=22)){
        System.out.println("Es Leo");
       }
       else if((mes==8 && (dia>=23 && dia<=30)) || (mes==9 && dia<=22)){
        System.out.println("Es Virgo");
       }
       else if((mes==9 && (dia>=23 && dia<=31)) || (mes==10 && dia<=12)){
        System.out.println("Es Libra");
       }
       else if((mes==10 && (dia>=23 && dia<=30)) || (mes==11 && dia<=21)){
        System.out.println("Es escorpio");
       }
       else if((mes==11 && (dia>=22 && dia<=30)) || (mes==12 && dia<=21)){
        System.out.println("Es Sagitario");
       }
       else if((mes==12 && (dia>=22 && dia<=31)) || (mes==1 && dia<=19)){
        System.out.println("Es Capricornio");
       }
       else if((mes==1 && (dia>=20 && dia<=31)) || (mes==2 && dia<=18)){
        System.out.println("Es acuario");
       }
       else if((mes==2 && (dia>=19 && dia<=29)) || (mes==3 && dia<=20)){
        System.out.println("Es piscis");
       }
    }
    public void actividad4(){
        Scanner sc=new Scanner(System.in);
        //Hago que pida la nota de los dos parciales
        System.out.print("Diga la nota del primer parcial: ");
        double nota1=sc.nextDouble(); sc.nextLine();
        System.out.print("Diga la nota del segundo parcial: ");
        double nota2=sc.nextDouble();
        Double media=(nota1+nota2)/2;
        
        //Si la media es mayor que 5 estara aprobado
        if(media>=5){
            System.out.println("Alumno aprobado! La media es: "+media);
        }
        //Si la media es menor que 5, se tendra en cuenta la recuperacion
        else{
            //Hago que el valor de la recuperacion sea un boolean ya que solo tiene 2 valores, si o no
            boolean recuperacion;
            System.out.println("Nota menor que 5. ¿La recuperación es apta?");
            recuperacion=sc.nextBoolean();
            if(recuperacion==true){
                media=5.;
                System.out.println("Recuperación apta, alumno aprobado! La media es: "+media);
            }
            else{
                System.out.println("Recuperación no apta, alumno suspenso. La media es: "+media);
            }
        }
    } 
    
    public static void main(String[] args) {
        
        

    }
}
