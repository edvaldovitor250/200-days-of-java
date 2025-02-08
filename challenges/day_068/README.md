# Day 68

## Desafio:

Escreva um programa Java que gere um triângulo de Pascal de tamanho N.	

**Resultado:**

```java

public class Day068 {

    public static void main(String[] args) {
        trianguloPascal(5); 
    }

    static void trianguloPascal(int n) {
        int[][] triangulo = new int[n][n];

        for (int i = 0; i < n; i++) {
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
