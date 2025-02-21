# Day 84

## Desafio:

Escreva um programa Java que leia um texto e imprima o número total de linhas, palavras e caracteres.

**Resultado:**

```java

public class Day084 {

  public static void main(String[] args) {
    int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    calculoMatriz(m);
  }

  public static void calculoMatriz(int[][] m ) {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        sum += m[i][j];
      }
    }
    System.out.println("somas: " + sum);
  }	
}

