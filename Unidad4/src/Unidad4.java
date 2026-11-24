public class Unidad4 {
   public static void main(String[] args) {
    int[] numeros={4,7,3,9};
   //  int random;
   //  //Recorrer el vector
   //  System.out.print("Vector inicial: ");
   //  for(int i=0;i<numeros.length;i++){
   //      System.out.print(numeros[i]+", ");
   //  }
   //  System.out.println();
   //  //Asignar a cada posicion un valor
   //  System.out.print("Vector resultado: ");
   //  for(int i=0;i<numeros.length;i++){
   //     random=(int)(Math.random()*(4+1)+1);
   //     numeros[i]=random;
   //     System.out.print(numeros[i]+", ");
   //  }
   //  System.out.println();

   //  System.out.println(numeros[6]);

   //  Persona p1=new Persona("David", 33);
   //  Persona p2=new Persona("Maria", 25);

   //  //Vector personas
   //  Persona[] personas={p1,p2};

   // int[] resultado=null;
   // multiplica2bis(numeros);
   // System.out.println("REUSLTADO: ");
   // for(int i=0;i<numeros.length;i++){
   //    System.out.print(numeros[i]+", ");
   // }
   // System.out.println();


   //Matrices

//    String[][] comidas = {
//  {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
//  {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones",},
//  {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
//  };
//  String[] b = comidas[1];
//  System.out.println(comidas[1][6]);
//  System.out.println(b[2]);
   int[] array={1,2,3,4};
   int[] arrayCopia={0,0,0,0};
   for(int i=0;i<array.length;i++){
      arrayCopia[i]=array[i];
      System.out.print(arrayCopia[i]+", ");
   }
 


   

    
 }
 public static int[] multiplica2(int[] vector){
   int[] salida={0,0,0,0};
   for(int i=1;i<vector.length;i++){
      salida[i]=2*vector[i];
   }
   return salida;
 }

 public static void multiplica2bis(int[] vector){

   for(int i=1;i<vector.length;i++){
      vector[i]=2*vector[i];
   }
 }
}
