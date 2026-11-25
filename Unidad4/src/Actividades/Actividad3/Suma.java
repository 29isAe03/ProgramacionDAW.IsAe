package Actividades.Actividad3;

public class Suma {

    public static void main(String[] args) {
        int[][] MatrizA={
           {2,0,1},
           {3,0,0},
           {5,1,1}
        };
        int[][] MatrizB={
           {1,0,1},
           {1,2,1},
           {1,1,0}
        };

        int[][] MatrizC={
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        for(int i=0;i<MatrizA.length;i++){
           for(int j=0;j<MatrizA[i].length;j++){
            MatrizC[i][j]=MatrizA[i][j]+MatrizB[i][j];
           }
        }
        for(int i=0;i<MatrizC.length;i++){
            for(int j=0;j<MatrizC[i].length;j++){
                System.out.print(MatrizC[i][j]+" ,");
            }
            System.out.println();
        }




}


}
