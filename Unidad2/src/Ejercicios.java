import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicios {
    public static int numeroPar(int numero){
            int contadorPar=0;
            if(numero==0){
                contadorPar=1;
            }
            else{
                while(numero>0){
                    int digito=numero%10;
                    if(digito%2==0){
                        contadorPar++;
                    }
                    numero=numero/10;
                }
            }
            return contadorPar;
        }
    public static int numeroImpar(int numero){
        int contadorImpar=0;
        while(numero>0){
            int digito=numero%10;
            if(digito%2!=0){
                contadorImpar++;
            }
     
        }
        return contadorImpar;
    }   

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
    public void actividad6(){
        
        Scanner sc=new Scanner(System.in);
        //Creo una variable para los dos sueldos
        int bruto=0;
        int neto=0;
        System.out.print("Escriba el cargo(1-3): ");
        int empleo=sc.nextInt(); sc.nextLine();
        //Hago un switch para que dependiendo el cargo asigne una cantidad u otra
        switch(empleo){
            case 1: bruto=950; break;
            case 2: bruto=1200; break;
            case 3: bruto=1600; break;
        }
        System.out.print("Introduzca dias de viaje: ");
        int viaje=sc.nextInt(); sc.nextLine();
        //Simplemente hago que si hay dias de viaje te los añada al sueldo
        if(viaje>0){
            bruto=bruto+(viaje*30);
        }
        System.out.print("Introduzca estado civil(1-2): ");
        int estado=sc.nextInt();
        System.out.println("---------------------------"); //Pongo las lineas para hacerlo mas bonito
        System.out.println("Sueldo bruto: "+bruto);
        //Hago que depiendo del estado civil, te quite un 20 o 25% en IRPF
        if(estado==1){
            neto=bruto-((bruto*25)/100);
            System.out.println("Retención IRPF(25%): "+(bruto*25)/100);
        }
        else{
            neto=bruto-((bruto*20)/100);
            System.out.println("Retención IRPF(20%): "+(bruto*20)/100);
        }
         System.out.println("---------------------------");
        System.out.println("Sueldo neto: "+neto);
    }
    public void actividad5(){
                Scanner sc=new Scanner(System.in);
        //Creo una variable para cada dia de la semana teniendo cada una sus horas, aparte creo una que tenga todos los dias
        String horario=" Lunes: Entornos, LM, BD, Sistemas, Sistemas, Programación \n Martes: Sistemas, Digit, IPE, Sostenibilidad, Programación, Programación \n Miércoles: Programación, Programación, IPE, BD, BD, Programación \n Jueves: LM, LM, BD, BD, Programación, Programación \n Viernes: Sistemas, Sistemas, BD, Entornos, Entornos, IPE";
        String lunes="Lunes: Entornos, LM, BD, Sistemas, Sistemas, Programación";
        String martes="Martes: Sistemas, Digit, IPE, Sostenibilidad, Programación, Programación";
        String miercoles="Miércoles: Programación, Programación, IPE, BD, BD, Programación";
        String jueves="Jueves: LM, LM, BD, BD, Programación, Programación";
        String viernes="Viernes: Sistemas, Sistemas, BD, Entornos, Entornos, IPE";
        int dia;

        System.out.println(lunes);
        System.out.println(martes);
        System.out.println(miercoles);
        System.out.println(jueves);
        System.out.println(viernes);
        
        System.out.print("Inserte dia: ");
        //Hago un bucle para que te vaya diciendo dias hasta que escribas 7
        do{
            dia=sc.nextInt(); sc.nextLine();
            //Hago un switch porque solo varia la variable dia del 1-6
            switch (dia) {
                case 1: System.out.println(lunes); break;
                case 2: System.out.println(martes); break;
                case 3: System.out.println(miercoles); break;
                case 4: System.out.println(jueves); break;
                case 5: System.out.println(viernes); break;
                case 6: System.out.println(horario); break;
            }
            System.out.println("--------------------------------------------------------------"); //Pongo barras para que quede mas organizado
        }
        while(dia!=7);
    }
    public void actividad7(){
                        Scanner sc=new Scanner(System.in);
        //Creo una variable para el numero, contador de positivos, negativos y sietes, y la suma para hacer la media
        int numero=0;
        int contadorP=0;
        int contadorN=0;
        int contador7=0;
        int suma=0;
        System.out.println("Diga numeros");
        do{
            numero=sc.nextInt(); sc.nextLine();
            //Hago que la suma sea actualice con cada numero
            suma=suma+numero;
            //Si el numero es negativo, se sumara uno al contador negativo, si llega a ser -7 se sumara al contador de sietes
            if(numero<0){
                contadorN++;
                if(numero==(-7)){
                    contador7++;
                }
            }
            //Lo mismo aqui pero con positivos
            else if(numero>0){
                contadorP++;
                if(numero==7){
                    contador7++;
                }
            }
        }
        //Acaba cuando escribas 0
        while(numero!=0);
        //Hago que te escriba las veces que salio cada numero, los sietes y la media
        System.out.println("Numeros positivos: "+contadorP);
        System.out.println("Numeros negativos: "+contadorN);
        System.out.println("Sietes: "+contador7);
        System.out.println("La media es: "+(suma/(contadorN+contadorP)));
    

    }
    public void actividad8(){
                Scanner sc=new Scanner(System.in);
        //Hago que te pida la cantidad de numeros que quieras y creo los dos primeros valores: 0 y 1
        System.out.print("Diga cantidad de numeros: ");
        int numero=sc.nextInt(); sc.nextLine();
        System.out.println("----");
        int valor1=0;
        int valor2=1;
        //Hago un bucle que haga que el numero 1 pase a ser el 2, y el 2 pase a ser la suma del 1 y 2. Asi hasta llegar al numero deseado
        for(int i=0;i<=numero;i++){
            System.out.println(valor1+ " ");
            int valor3=valor1+valor2;
            valor1=valor2;
            valor2=valor3;
        }
    }
    public void actividad9(){}
    public void actividad10(){
                Scanner sc=new Scanner(System.in);
        System.out.print("Escriba el numero: ");
        int numero=sc.nextInt();
        int contadorPar=0;
        int contadorImpar=0;
        if(numero==0){
            contadorPar=1;
        }
        else{
            while(numero>0){
              int digito=numero%10;
              if(digito%2==0){
                contadorPar++;
              }
              else{
                  contadorImpar++;
              }
              numero=numero/10;
            }
        System.out.println("Tiene "+contadorPar+ " Pares y "+contadorImpar+" Impares");
        }
    }
    public static void main(String[] args) {
        

    }
}
    

