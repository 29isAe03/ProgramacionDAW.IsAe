public class Actividad2 {
    public static void main(String[] args) {
        //Los terminos
        int a=1;
        int b=1;
        int c=1;

        double solucion1;
        double solucion2;
        //Hago Delta
        int delta=((b*b)-(4*a*c));
        if(delta<0){
            System.out.println("No hay soluciones");
        }
        //Si Delta=>0
        else{
            if(delta==0){
                solucion1=((-b)/(2*a));
                System.out.println("La unica solución es: "+solucion1);

         
            }
            else{
                solucion1=(((-b)+(double)(Math.sqrt(delta)))/(2*a));
                solucion2=(((-b)-(double)(Math.sqrt(delta)))/(2*a));
                System.out.println("Las soluciones son: "+solucion1+" y "+solucion2);
                
            }
       
       
        }   

    }
}   