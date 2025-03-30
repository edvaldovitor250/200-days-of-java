# Day 121

## Desafio:

Implemente um programa Java que leia uma matriz e calcule o número de elementos positivos, negativos e zeros.	

**Resultado:**

```java

public class Day121 {

    public static void main(String[] args) {
        int[] m = {1, -2, 3, 0, -5};
        leituraDeMatrizZeroPositivoNegativo(m);
    }

  public static void leituraDeMatrizZeroPositivoNegativo(int[] m){
    int i, j, n = m.length;
    int[][] matriz = new int[n][n];
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        if (m[i] > 0) {
          matriz[i][j] = 1;
        } else if (m[i] < 0) {
          matriz[i][j] = -1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }
    System.out.println("Matriz:");
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
