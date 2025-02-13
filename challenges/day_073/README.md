# Day 73

## Desafio:

Escreva um programa Java que leia uma matriz e calcule a soma de todos os elementos acima da diagonal secundária.

**Resultado:**

```java

public class Day073 {


    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int soma = calcularSomaAcimaDiagonalSecundaria(matriz);
        System.out.println("Soma dos elementos acima da diagonal secundária: " + soma);
    }

    public static int calcularSomaAcimaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
