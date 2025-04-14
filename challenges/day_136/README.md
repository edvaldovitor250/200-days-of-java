# Day 136

## Desafio:

Implemente um programa Java que leia uma matriz e imprima os elementos da diagonal principal em ordem inversa.	

**Resultado:**

```java
import java.util.Arrays;

public class Day136 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Diagonal Principal:");
        diagonalPrincipalEmOrdemInversa(matriz);
        

    }


    public static void diagonalPrincipalEmOrdemInversa(int[][] matriz){
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(matriz[i]) + " ");
        }
    }
}
