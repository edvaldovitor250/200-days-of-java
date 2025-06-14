# Day 195

## Desafio:

Implemente um programa Java que leia uma matriz e determine se ela é uma matriz escalonada por linhas.	

**Resultado:**

```java

public class Day196 {

    public static void determineMatrizEscalonaPorLinha(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;

        for (int i = 0; i < n; i++) {
            boolean isEscalona = true;
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] != 0 && j < i) {
                    isEscalona = false;
                    break;
                }
            }
            if (isEscalona) {
                System.out.println("La fila " + i + " es escalona.");
            } else {
                System.out.println("La fila " + i + " no es escalona.");
            }
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };

        determineMatrizEscalonaPorLinha(matriz);
    }
   
}