# Day 154

## Desafio:

Implemente um programa Java que leia uma matriz e verifique se ela é uma matriz de identidade.	

**Resultado:**

```java

public class Day154 {


    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matrizIdentidade(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizIdentidade(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }
}