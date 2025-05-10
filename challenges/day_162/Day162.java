public class Day162 {

    public static void main(String[] args) {
        verificadorMagicSquare(new int[][]{
                {16, 23, 17, 15},
                {5, 10, 14, 20},
                {24, 7, 1, 6},
                {4, 3, 2, 21}
        });
    }

    public static void verificadorMagicSquare(int[][] square) {
        int n = square.length;
        int magicSum = n * (n * n + 1) / 2;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                System.out.println("No es un cuadrado mágico");
                return;
            }
        }

        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += square[i][i];
            diag2Sum += square[i][n - i - 1];
        }
        if (diag1Sum != magicSum || diag2Sum != magicSum) {
            System.out.println("No es un cuadrado mágico");
            return;
        }

        System.out.println("Es un cuadrado mágico");
    }

}
