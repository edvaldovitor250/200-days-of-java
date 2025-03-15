# Day 106

## Desafio:

Implemente um programa Java que leia uma matriz e calcule a soma dos elementos de cada linha.	

**Resultado:**

```java

public class Day106 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        calculoMatriz(matriz);
    }

    public static void calculoMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Soma das matriz são: " + suma);
    }
    
}
