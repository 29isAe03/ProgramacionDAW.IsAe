import java.util.Scanner;

public class Ejercicio1 {
    public static void ejercicio(){
                Scanner sc=new Scanner(System.in);
        //Hago que pida cada variable
        System.out.print("Numero de entradas: ");
        int entradas=sc.nextInt(); sc.nextLine();
        System.out.print("Dia de la semana: ");
        int dia=sc.nextInt(); sc.nextLine();
        System.out.println("Tarjeta socio? ");
        boolean tarjeta=sc.nextBoolean();
        //Creo el precio, descuento y el total
        double precio=0;
        double descuento=0;
        double pagar=0;
        //Hago un switch para cada dia, siendo el miercoles el precio 5 por entrada en vez de 8, y el jueves que el precio por parejas es 11
        switch (dia) {
            case 1:
            case 2: precio=entradas*8; break;
            case 3: precio=entradas*5; break;
            case 4: 
               //Si el numero de entradas es par, se puede reducir en parejas
               if(entradas%2==0){
                   precio=11*(entradas/2); //Por eso entradas/2
                }
                else{
                   precio=entradas*8;
                } break;
            
            case 5: 
            case 6:
            case 7: precio=entradas*8; break;
        }
        if(tarjeta==true){  //Si tiene tarjeta se le descontara un 10% 
            descuento=precio*0.1;
            pagar=precio*0.9;
        }
        else{
        }
        //Imprime resultado
        System.out.println("Gracias por la compra");
        System.out.println("Precio: "+precio);
        System.out.println("Descuento: "+descuento);
        System.out.println("Pagar: "+pagar);
    }
    public static void main(String[] args) throws Exception {
        ejercicio();

    }
}
