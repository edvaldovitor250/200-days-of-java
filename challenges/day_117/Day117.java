
public class Day117{
    public static void main(String[] args){
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        diagonalPrincipalMatriz(matriz);
    }

    public static void diagonalPrincipalMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
    }

}
