# Day 87

## Desafio:

Crie um programa Java que leia uma matriz e calcule a soma dos elementos da diagonal principal e da secundária.	

**Resultado:**

```java

import java.util.Scanner;

public class Day087 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz (n x n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Informe os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];  
            somaDiagonalSecundaria += matriz[i][n - 1 - i];  
        }

        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
        
        scanner.close();
    }

}

