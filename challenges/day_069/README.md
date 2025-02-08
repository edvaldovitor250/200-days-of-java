# Day 69

## Desafio:

Escreva um programa Java que gere um triângulo de Pascal de tamanho N.	

**Resultado:**

```java

public class Day069 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        diagonalPrincipal(matrix);
    }

    static void diagonalPrincipal(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            System.out.println("A matriz não é quadrada!");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
