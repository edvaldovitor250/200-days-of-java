
public class Day166 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matriz em forma de caracol:");
        letiorMatrizFormaCaracol(matriz);
    }

    public static void letiorMatrizFormaCaracol(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int inicioLinha = 0, fimLinha = linhas - 1;
        int inicioColuna = 0, fimColuna = colunas - 1;

        while (inicioLinha <= fimLinha && inicioColuna <= fimColuna) {
            // Percorre a linha superior
            for (int i = inicioColuna; i <= fimColuna; i++) {
                System.out.print(matriz[inicioLinha][i] + " ");
            }
            inicioLinha++;

            // Percorre a coluna direita
            for (int i = inicioLinha; i <= fimLinha; i++) {
                System.out.print(matriz[i][fimColuna] + " ");
            }
            fimColuna--;

            // Verifica se ainda há linhas e colunas restantes
            if (inicioLinha <= fimLinha) {
                // Percorre a linha inferior
                for (int i = fimColuna; i >= inicioColuna; i--) {
                    System.out.print(matriz[fimLinha][i] + " ");
                }
                fimLinha--;
            }

            if (inicioColuna <= fimColuna) {
                // Percorre a coluna esquerda
                for (int i = fimLinha; i >= inicioLinha; i--) {
                    System.out.print(matriz[i][inicioColuna] + " ");
                }
                inicioColuna++;
            }
        }
    }

   
}
