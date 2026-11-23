public class Unidad4 {
   public static void main(String[] args) {
    int[] numeros={0,0,0,0,0};
    int random;
    //Recorrer el vector
    System.out.print("Vector inicial: ");
    for(int i=0;i<numeros.length;i++){
        System.out.print(numeros[i]+", ");
    }
    System.out.println();
    //Asignar a cada posicion un valor
    System.out.print("Vector resultado: ");
    for(int i=0;i<numeros.length;i++){
       random=(int)(Math.random()*(4+1)+1);
       numeros[i]=random;
       System.out.print(numeros[i]+", ");
    }
    System.out.println();

    System.out.println(numeros[6]);

    Persona p1=new Persona("David", 33);
    Persona p2=new Persona("Maria", 25);

    //Vector personas
    Persona[] personas={p1,p2};
    
   }
}
