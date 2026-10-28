import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio(){
                Scanner sc=new Scanner(System.in);
        //Creo una variable para cada cosa que pide
        int numero;
        int contadorNumeros=0;
        int sumaImpar=0;
        int mayorPositivo=0;
        int menorNegativo=0;
        System.out.println("Diga numeros: ");
        do{
            //Hago que cada numero se suma el contador
            numero=sc.nextInt(); sc.nextLine();
            contadorNumeros++;
            //Si es Impar se añade a la suma
            if(numero%2!=0){
               sumaImpar=sumaImpar+numero;
            }
            //Si el numero que escribes es mayor que el maximo, ese numero pasa a ser el maximo
            if(numero>mayorPositivo){
                mayorPositivo=numero;
            }
            //Lo mismo pero con el minimo
            if(numero<menorNegativo){
                menorNegativo=numero;
            }
        }while(numero!=0);
        //Imprima resultado
        System.out.println("Numeros: "+contadorNumeros);
        System.out.println("Suma Impares: "+sumaImpar);
        System.out.println("Mayor positivo: "+mayorPositivo);
        System.out.println("Menor negativo: "+menorNegativo);
    }
    public static void main(String[] args) {
        ejercicio();
    }
}
