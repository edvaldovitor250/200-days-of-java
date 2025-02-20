# Day 83

## Desafio:

Escreva um programa Java que leia um texto e imprima o número total de linhas, palavras e caracteres.

**Resultado:**

```java

public class Day083 {

  public static void main(String[] args) {
    totalDeLetras("Hoje e dia de prova");
  }

  public static void totalDeLetras(String texto) {
    int total = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (Character.isLetter(texto.charAt(i))) {
        total++;
      }
    }
    System.out.println("Total de letras: " + total);
  }	


}

