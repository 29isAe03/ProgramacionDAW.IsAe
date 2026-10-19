import java.util.Scanner;

public class Actividades {
    final static double pi=Math.PI; //Declaro la constante del ejercicio 14
    public static boolean esPar(int numero){ //Ver si numero es par
        if(numero%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean esDivisible2y3(int numero){ //Ver si numero es divisible entre 3 y 2
        if(numero%2==0 && numero%3==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int digitos(int numero){
        if(numero==0){
            return 1;
        }
        else{
            return numero%digitos(numero/10);
        }
    }








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
    public static void actividad6(){ //Factorial
        Scanner sc=new Scanner(System.in);
        //Hago que pida el numero
        System.out.print("Diga el numero: ");
        int numero=sc.nextInt();
        int factorial=1;
        //Hago un for que empiece en el numero y se vaya multiplicando hasta llegar a 1
        for(int i=numero; i>=1;i--){
           factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void actividad7(){ //Contador de edades
        Scanner sc=new Scanner(System.in);
        //Creo un maximo y un minimo, la variable del numero y un contador
        int max=0;
        int min=0;
        int numero;
        int contador=0;
        do{
            System.out.println("Escriba la edad: ");
            numero=sc.nextInt(); sc.nextLine();
            //Hago un if para cada caso que pueda ser numero
            if(contador==0){
                max=numero;
                min=numero;
                contador++;
            }
            else if(numero>max){ //Si un numero es mas grande que el maximo, ese numero pasa a ser el maximo
                max=numero;
            }
            else if(numero<min && numero!=-1){ //Lo mismo pero con el minimo. Aparte especifico que si numero es -1 no cuente
                min=numero;
            }

        }
        while(numero!=-1);
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);

    }
    public static void actividad8(){ //Contador de edades con adultos
        Scanner sc=new Scanner(System.in);
        //Creo un maximo y un minimo, la variable del numero y un contador
        int max=0;
        int min=0;
        int numero;
        int contador=0;
        int adultos=0;
        int suma=0;
        int total=0;
        do{
            System.out.println("Escriba la edad: ");
            numero=sc.nextInt(); sc.nextLine();
            //Hago un if para cada caso que pueda ser numero
            if(contador==0){
                max=numero;
                min=numero;
                contador++;
            }
            if(numero>max){ //Si un numero es mas grande que el maximo, ese numero pasa a ser el maximo
                max=numero;
            }
            if(numero<min && numero!=-1){ //Lo mismo pero con el minimo. Aparte especifico que si numero es -1 no cuente
                min=numero;
            }
            if(numero!=-1){
                suma=suma+numero;
                total++;
            }
            if(numero>=18){
                adultos++;
            }

        }
        while(numero!=-1);
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("Hay "+adultos+" adultos");
        System.out.println("Hay "+total+" alumnos");
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio de edad es: "+(suma/(double)total));
    }
    public static void actividad9(){ //Adivinar el numero
                Scanner sc=new Scanner(System.in);
        int max=100;
        int min=1;
        int contador=0;
        int intento;
        //Creo un numero aleatorio
        int numero=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Adivina el numero");
        do{
            //Hago que te diga si los has adivinado o no, si es mayor o menor y voy añadiendo al contador
            intento=sc.nextInt(); sc.nextLine();
            if(intento>numero){
                System.out.println("Numero incorrecto. El numero es menor");
                contador++;
            }
            else if(intento<numero){
                System.out.println("Numero incorrecto. El numero es mayor");
                contador++;
            }
            else if(intento==numero){
                System.out.println("Numero correcto! Intentos: "+contador);
                contador++;
            }
        }
        while(intento!=numero);
    }
    public static void actividad10(){ //Calculadora
                Scanner sc=new Scanner(System.in);
        //Creo la variable de los numeros
        int numero1;
        int numero2;
        int operacion;
        do{
            //Hago que cada numero sea una operación
            System.out.println("Calculadora. Elige el calculo: ");
            System.out.println("Sumar=1 / Restar=2 / Multiplicar=3 / Dividir=4 / Terminar=-1");
            operacion=sc.nextInt(); sc.nextLine();
            //Hago que despues de elegir la operación te pida los numeros
            if(operacion==1){
                System.out.println("Suma, diga los numeros");
                numero1=sc.nextInt(); sc.nextLine();
                numero2=sc.nextInt(); sc.nextLine();
                System.out.println(numero1+"+"+numero2+"="+(numero1+numero2));
            }
            if(operacion==2){
                System.out.println("Resta, diga los numeros");
                numero1=sc.nextInt(); sc.nextLine();
                numero2=sc.nextInt(); sc.nextLine();
                System.out.println(numero1+"-"+numero2+"="+(numero1-numero2));
            }
            if(operacion==3){
                System.out.println("Multiplicación, diga los numeros");
                numero1=sc.nextInt(); sc.nextLine();
                numero2=sc.nextInt(); sc.nextLine();
                System.out.println(numero1+"x"+numero2+"="+(numero1*numero2));
            }
            if(operacion==4){
                System.out.println("División, diga los numeros");
                numero1=sc.nextInt(); sc.nextLine();
                numero2=sc.nextInt(); sc.nextLine();
                System.out.println(numero1+"/"+numero2+"="+(numero1/numero2));
            }
            if(operacion==-1){
                System.out.println("Calculos terminados");
            }
            
        }
        while(operacion!=-1);
    }
    public static void actividad11(){ //MCD
                Scanner sc=new Scanner(System.in);
        //Hago que te pidan los numeros
        System.out.println("Introduce los numeros: ");
        int numero1=Math.abs(sc.nextInt()); sc.nextLine();
        int numero2=Math.abs(sc.nextInt()); sc.nextLine();
        //Hago la operación
        while(numero2!=0){
            int resto=numero1%numero2;
            numero1=numero2;
            numero2=resto;
        }
        System.out.println("El MCD es: "+numero1);
    }
    public static void actividad12(){ //MCM
         Scanner sc=new Scanner(System.in);
        //Hago que te pidan los numeros
        System.out.println("Introduce los numeros: ");
        int numero1=Math.abs(sc.nextInt()); sc.nextLine();
        int numero2=Math.abs(sc.nextInt()); sc.nextLine();
        int mayor=Math.max(numero1, numero2);
        int mcm=mayor;
        //Hago la operación
        while(mcm%numero1!=0 || mcm%numero2!=0){
           mcm=mcm+mayor;
        }
        System.out.println("El MCM es: "+mcm);
    }
    public static void actividad13(){ //Tablas de multiplicar
                //Hago un bucle que sea el primer numero
       for(int i=1;i<=10;i++){
        //Hago otro que sea el segundo numero, asi siempre tendra que llegar a 10 el segundo numero antes que el primero
        for(int j=1;j<=10;j++){
            System.out.println(i+"x"+j+"="+(i*j));

        }
       }
    }
    public static void actividad14(){ //Area y volumen cilindro
                Scanner sc=new Scanner(System.in);
        //Hago que pida las dimensiones
        System.out.println("Diga la altura: ");
        int altura=sc.nextInt(); sc.nextLine();
        System.out.println("Diga el radio: ");
        int radio=sc.nextInt();
        //Hago los calculos con la constante
        double area=(2*pi*(altura+radio));
        double volumen=(pi*(radio*radio)*altura);
        System.out.println("El area y el volumen son: "+area+" y "+volumen);
    }
    public static void actividad15(){ //Pares y divisibles2y3 entre 1 y 20
                //Creo un bucle que vaya del 1 al 20 
       for(int i=1; i<=20; i++){
        //Miro con las funciones que he creado si cumple los requisitos, si es asi que los imprima
        if(esPar(i)==true && esDivisible2y3(i)==true){
            System.out.println(i);
        }
       }
    }



    public static void main(String[] args) {
       System.out.println(digitos(23));
    }
   


}
