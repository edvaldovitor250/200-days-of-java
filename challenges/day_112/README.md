# Day 112

## Desafio:

Implemente um programa Java que leia uma matriz e multiplique todos os elementos por um escalar.

**Resultado:**

```java

public class Day112 {

    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};
        multiplicarMatriz(matriz1, matriz2);
    }

    public static void multiplicarMatriz(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[0].length; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
