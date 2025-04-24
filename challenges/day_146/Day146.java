public class Day146 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        matrizElementosFormados(matriz);
    }

    public static void matrizElementosFormados(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
