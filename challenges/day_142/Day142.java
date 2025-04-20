public class Day142 {


    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        calcularMatriz(matriz);
    }


    public static void calcularMatriz(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;
        int[][] resultado = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultado[i][j] = matriz[i][j] * 2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
  

}
