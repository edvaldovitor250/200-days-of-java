# Day 22

## Desafio:

Implemente um programa Java que encontre o maior elemento em um array usando um loop for.

**Resultado:**

```java

import java.util.ArrayList;


public class Day022 {

  public static void main(String[] args) {
    int[] n =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int maior = Integer.MAX_VALUE;
    int indiceMaior = -1;

    for (int i = 0; i < n.length; i++) {
      if (n[i] > maior) {
        maior = n[i];
        indiceMaior = i;

      }
      System.err.println("Maior: " + maior);
        
    }
  }

  }
 
  

