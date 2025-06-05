# Day 187

## Desafio:

Implemente um programa Java que leia uma matriz e determine se ela é uma matriz triangular superior.	

**Resultado:**

```java

public class Day187 {

    public static void main(String[] args) {
        matrizTriangularSuperior(new int[][]{
            {1, 2, 3},
            {0, 5, 6},
            {0, 0, 9}
        });
    }


    public static boolean matrizTriangularSuperior(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true; 
    }

}