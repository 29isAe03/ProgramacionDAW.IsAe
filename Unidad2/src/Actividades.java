import java.util.Scanner;

public class Actividades {

    // //Variables globales
    // static int valorJ=3;
    // final static double PI=3.14159;

    // //Ejemplo de procedimiento para imprimir mensajes con una variable
    // public static void imprimir(String cadena,int variable){
    //     System.out.println(cadena+variable);
    // }
    // //Ejemplo de función para realizar la suma de 2 números enteros
    // public static int suma(int a, int b){
    //     return a+b;
    // }
    // //Ejemplos de polimorfismo, una función se puede llamar igual si tiene diferente número de parámetros o devuelve tipos diferentes
    // public static int suma(int a, int b,int c){
    //     return c;
    // }
    // public static double suma(double a, double b){
    //     return a+b;
    // }
    
    // //Función que hace uso de otra función dentro para efectuar cálculos
    // public static void actividadTonta(){
    //     int a=3;
    //     int b=4;
    //     System.out.println(maximo(a,b));
    // }
    // //El orden de las funciones da igual, tienen que estar definidas antes o después del main
    // public static int maximo(int valor1,int valor2){
    //     // int maximo;
    //     // if(valor1>=valor2){
    //     //     maximo=valor1;
    //     // }
    //     // else{
    //     //     maximo=valor2;
    //     // }
    //     // return maximo;
    //     return valor1>=valor2? valor1:valor2;
    // }
    // //Funciones de las actividades realizadas hasta ahora
    // public static void actividad1(){
    //     /*
    //         Actividad: Realiza un programa que genera 2 números (a,b) 
    //         y nos diga el cociente (a/b), la media ((a+b)/2), la potencia (a^b) 
    //         y la raíz cuadrada de cada uno
    //     */
    //    //Generar dos números de manera aleatoria
    //    int min=1,max=10;
    //    int aleatorio1=(int)(Math.random()*(max-min+1)+min);
    //    double aleatorio2=(int)(Math.random()*(max-min+1)+min);

    //    double division=aleatorio1/aleatorio2;
    //    double media=(aleatorio1+aleatorio2)/2.0;
    //    //Realizar las operaciones
    //    System.out.println("Los números generados son: "+aleatorio1+" y "+aleatorio2);
    //    System.out.println("La división es: "+division);
    //    System.out.println("La media es: "+media);
    //    System.out.println("La potencia vale: "+Math.pow(aleatorio1,aleatorio2));
    //    System.out.println("Las raices cuadrados son: "+Math.sqrt(aleatorio1)+ " y "+Math.sqrt(aleatorio2));
    
    // }
    // public static void actividad2(){
    //     /*
    //     Actividad: ¿Cómo sabemos si un número es divisible por 2 y por 3?
    // */
    // int numero=6;
    // // if(numero%2==0 && !numero%3==0){
    // //     System.out.println("Es divisible por 2 y 3");
    // // }
    // // else{
    // //     System.out.println("NO es divisible por 2 y 3");
    // // }
    // if(numero%2==0){
    //     if(numero%3==0){
    //         System.out.println("Si es divisible por 2 y 3");
    //     }
    //     else{
    //         System.out.println("NO es divisible por 2 y 3");
    //     }
    // }
    // else{
    //     System.out.println("NO es divisible por 2 y 3");
    // }
    // }
    // public static void actividad3(){
    //     /*
    //     Actividad: Ecuación de segundo grado
    //      */
    //     //Declaro las variables a  b y c
    //     int a, b, c;
    //     //Declaro las varible de las soluciones
    //     double x1,x2;
    //     //Definir la lectura de las variables
    //     Scanner sc = new Scanner(System.in);
    //     a=Integer.parseInt(sc.nextLine());
    //     b=Integer.parseInt(sc.nextLine());
    //     c=Integer.parseInt(sc.nextLine());

    //     int variable=b*b-4*a*c;

    //     if(variable<0){
    //         System.out.println("No hay soluciones");
    //     }
    //     else if(variable==0){
    //         x1=-b/(2.0*a);
    //         System.out.println("La única solución es: "+x1);
    //     }
    //     else{
    //         x1=(-b + Math.sqrt(variable))/(2.0*a);
    //         x2=(-b - Math.sqrt(variable))/(2.0*a);
    //         System.out.println("La primera solución es: "+x1);
    //         System.out.println("La segunda solución es: "+x2);
    //     }
    //     sc.close();
    // }
    // public static void actividad4(){
    //     /*
    //     Actividad calificaciones 
    //     */
    //     //Leer la calificación
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Introduce la nota: ");
    //     double numero=Double.parseDouble(sc.nextLine());
    //     //Comprobar calificación CON IF-ELSE
    //     if(numero<5 || numero>0){
    //         System.out.println("SUSPENSO");
    //     }
    //     else if (numero>=5 && numero <6){
    //         System.out.println("APPROBADO");
    //     }
    //     else if( numero>=6 && numero <7){
    //         System.out.println("BIEN");
    //     }
    //     else if( numero>=7 && numero <9){
    //         System.out.println("NOTABLE");
    //     }
    //     else{
    //         System.out.println("SOBRESALIENTE");
    //     }
    //     //Comprobar calificación con SWITCH
    //     switch((int)numero){//Tiene que comprobar un valor. Verás que no siempre se podrá usar switch
    //         case 0: 
    //         case 1:
    //         case 2:
    //         case 3:
    //         case 4: System.out.println("SUSPENSO"); break;
    //         case 5: System.out.println("APROBADO"); break;
    //         case 6: System.out.println("BIEN"); break;
    //         case 7:
    //         case 8: System.out.println("NOTABLE"); break;
    //         case 9:
    //         case 10: System.out.println("SOBRESALIENTE"); break;
    //         default: System.out.println("Valor incorrecto"); break;
    //     }
    //     sc.close();
    // }
    // public static void actividad5(){
    //     /*
    //     Actividad validar día mes año
    //     */
    //     Scanner sc =new Scanner(System.in);
    //     int dia, mes, anio;
    //     System.out.println("Introuce el dia mes año");
    //     dia=sc.nextInt();
    //     mes=sc.nextInt();
    //     anio=sc.nextInt(); sc.nextLine();

    //     if((dia>0 && dia <=31) && (mes>0 && mes <=12)){
    //         if(dia==29 && mes==2){//Comprobar si el año es bisiesto
    //             if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
    //                 System.out.println("La fecha es correcta");    
    //             }
    //             else{
    //                 System.out.println("La fecha es incorrecta");        
    //             }
    //         } 
    //         else{
    //             System.out.println("La fecha es correcta");
    //         }
    //     }
    //     else{
    //         System.out.println("La fecha es incorrecta");
    //     }
    //     sc.close();//Si te acuerdas mejor
    // }
    // public static void actividad6(){
    //     /*
    //     Actividad bucle de mútliplos de 2 y 3 entre 50 y 200 
    //     */
    //     for(int i=50;i<=200;i++){
    //         if(i%2==0 && i%3==0){//Haz variantes para ver resultados
    //             System.out.println(i);
    //         }
    //     }
    // }
    // public static void actividad7(){
    //     /*
    //     Actividad del factorial
    //     */
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Introduce el número mayor que 0: ");
    //     while(!sc.hasNextInt()){
    //         System.out.println("HAS INTRODUCIDO UN NÚMERO INCORRECTO. Vuelve a intentarlo: ");
    //         sc.nextLine();
    //     }
    //     int numero=sc.nextInt();
    //     int producto=1;
    //     //Opción 1: Utilizando bucle for
    //     // for(int i=numero;i>=1;i--){
    //     //     producto=producto*i;
    //     // }
    //     //Opción 2: Recordad que a veces se puede hacer un programa de varias formas
    //     while(numero>0){
    //         producto=producto*numero;
    //         numero--;
    //     }
    //     System.out.println("El factorial de "+numero+" es: "+producto);
    //     sc.close();
    // }
    // public static void actividad8(){
    //     /*
    //     Actividad: Edades mayor y menor hasta -1 
    //     */
    //     int maximo=0,minimo=0,numero,contador=0;
    //     int contAdultos=0,suma=0,total=0;
    //     //Variable para lectura de teclado
    //     Scanner sc=new Scanner(System.in);

    //     //Repetir hasta leer -1
    //     do{
    //         System.out.println("Escribe la edad: ");
    //         numero=sc.nextInt(); sc.nextLine();
    //         if (contador==0){
    //             maximo=numero;
    //             minimo=numero;
    //             contador++;
    //         }
    //         if(numero>maximo){
    //             maximo=numero;
    //         }
    //         if((numero<minimo) && (numero!=-1)){
    //             minimo=numero;
    //         }
    //         if(numero!=-1){
    //             suma=suma+numero;
    //             total++;
    //         }
    //         if(numero>=18){
    //             contAdultos++;
    //         }
    //     }while(numero!=-1);
    //     //Imprimir resultados
    //     System.out.println("El máximo es: "+maximo);
    //     System.out.println("El mínimo es: "+minimo);
    //     System.out.println("El número de alumnos introducido es: "+total);
    //     System.out.println("De los cuales adultos son: "+contAdultos);
    //     System.out.println("La suma de las edades es: "+suma);
    //     System.out.println("El promedio de edad es: "+(suma/(double)total));
    //     sc.close();
    // }
    // public static void actividad9(){
    //     /*
    //     Actividad: Adivinar número
    //     */
    //     //Declaramos las variables
    //     int numero,aleatorio, intentos=0;
    //     boolean encontrado=false;
    //     aleatorio= (int)(Math.random()* 100) + 1;
    //     System.out.println(aleatorio);

    //     //Definimos la entrada por teclado
    //     Scanner sc=new Scanner(System.in);
    //     do{
    //         System.out.print("DIME UN NÚMERO ENTRE 1 Y 100: ");
    //         numero=sc.nextInt(); sc.nextLine();
    //         //Comprobación
    //         if(numero<aleatorio){
    //             System.out.println("El número correcto es mayor al introducido");
    //         }
    //         else if (numero>aleatorio){
    //             System.out.println("El número correcto es menor al introducido");
    //         }
    //         else{
    //             System.out.println("¡¡¡hAS ACERTADO EL NÚMERO!!!!");
    //             encontrado=true;
    //         }
    //         intentos++;
    //     }while(!encontrado);
    //     System.out.println("Has utilizado "+intentos+" para acertar el número "+aleatorio);
    //     sc.close();
    // }
    // //Funciones que tomarán la variable global constante PI para hacer los cálculos
    // public static void calcularAreaCilindro(double radio, double altura){
    //     double area=2*PI*(altura+radio);
    //     System.out.println("El área del cilindro es: "+area);
    // }
    // public static void calcularVolumenCilindro(double radio, double altura){

    //     double volumen=PI*radio*radio*altura;
    //     System.out.println("El volumen del cilindro es: "+volumen);
    // }
    // public boolean esPar(int a){
    //     boolean paridad;
    //     if((a%2)==0){
    //         paridad=true;
    //     }
    //     else{
    //         paridad=false;
    //     }
    //     return paridad;

    // }
    // public boolean esDivisible2y3(int a){
    //     boolean divisibilidad;
    //     if(((a%2)==0)) && (((a%3)==0)){
    //         divisibilidad=true;

    //     }
    //     else{
    //         divisibilidad=false;
    //     }
    //     return divisibilidad;
    }
    public static 
    public static void main(String[] args) {
        
        //Uso de las funciones creadas de las actividades
        // actividad1();
        // actividad4();
        // actividad9();

        //Clase 5: Utilizando métodos básicos
        // imprimir("adfasfasdadf ",9);
        // imprimir("La suma de 3+5 es: ",suma(3,5));
        // imprimir("La suma de 3+5 es: ",1+suma(3,5));

        //Cuidado con el ámbito de las variables
    //     valorJ+=5; //Las variables globales si no son constantes se pueden cambiar
    
    //     //Usando las funciones de calcular área y volumen del cilindro
    //     double radio=3;
    //     double altura=5;
    //     calcularAreaCilindro(radio, altura);
    //     calcularVolumenCilindro(radio,altura);
    // }

    // //Las funciones pueden estar antes o después de main para utilizarlas
    // // public static void imprimeAlgo(){
    //     int valorA=0;
    //     valorA=valorJ;
    //     imprimir("Valor de variable: ",valorA);
    // }
    }
}
