
public class Day193 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        matrizElementosEmOnda(matriz);
    }


    public static void matrizElementosEmOnda(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            if (i % 2 == 0) {
                // Linha par: imprime da esquerda para a direita
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
            } else {
                // Linha ímpar: imprime da direita para a esquerda
                for (int j = colunas - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}