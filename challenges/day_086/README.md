# Day 86

## Desafio:

Escreva um programa Java que leia uma lista de números e calcule a mediana.

**Resultado:**

```java

public class Day086 {

  public static void main(String[] args) {
    calculeMediana(1, 2, 3, 4, 5);
  }

  public static void calculeMediana(int... n){
    int  count = 0;
    for (int i = 0; i < n.length; i++) {
     int soma =  count += n[i];

     int mediana = soma / n.length;

      System.out.println("Mediana: " + mediana);

    }
  }

}

