# Day 62

## Desafio:

Escreva um programa Java que leia uma matriz e calcule o produto dos elementos de cada linha.

**Resultado:**

```java

import java.util.Scanner;

public class Day062 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            int produto = 1;
            for (int j = 0; j < colunas; j++) {
                produto *= matriz[i][j];  // Multiplica os elementos da linha
            }
            System.out.println("Produto dos elementos da linha " + (i + 1) + ": " + produto);
        }

        scanner.close();
    }


}
