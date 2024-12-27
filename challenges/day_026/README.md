# Day 26

## Desafio:

Escreva um programa Java que gere um array de números aleatórios e calcule a soma de todos os elementos.

**Resultado:**

```java

import java.util.Random;

public class Day026 {
  public static void main(String[] args) {

    Random random = new Random();

    int[] gerador1 = new int[10];

    int count = 0;

    for (int i = 0; i < gerador1.length; i++) {
      gerador1[i] = random.nextInt(100); 
      count += gerador1[i];
      System.out.println("Número " + (i + 1) + ": " + gerador1[i]);
    }

    System.out.println("Soma total: " + count);
  }
}
