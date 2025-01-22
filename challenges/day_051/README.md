# Day 51

## Desafio:

Crie um programa Java que leia uma matriz e imprima a soma de cada coluna.	

**Resultado:**

```java


import java.util.Scanner;

public class Day051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < colunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < linhas; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("Coluna %d: %d%n", j, somaColuna);
        }

        scanner.close();
    }
}
