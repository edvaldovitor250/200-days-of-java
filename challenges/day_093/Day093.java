import java.util.Scanner;

public class Day093 {

    public static int calcularDeterminante(int[][] matriz, int n) {
        int determinante = 0;
        
        if (n == 1) {
            return matriz[0][0];
        }

        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        for (int i = 0; i < n; i++) {
            int[][] subMatriz = new int[n - 1][n - 1];
            
            for (int j = 1; j < n; j++) {
                int colunaSub = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i) {
                        subMatriz[j - 1][colunaSub] = matriz[j][k];
                        colunaSub++;
                    }
                }
            }
            
            determinante += (int) Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(subMatriz, n - 1);
        }
        
        return determinante;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da matriz (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int determinante = calcularDeterminante(matriz, n);
        System.out.println("O determinante da matriz é: " + determinante);
        
        scanner.close();
    }

}

