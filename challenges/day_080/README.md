# Day 80

## Desafio:

	Escreva um programa Java que leia um texto e conte o número de palavras que começam com uma vogal.

**Resultado:**

```java

public class Day080 {

  public static void main(String[] args) {
    numerosPalavraComVogal("Ola mundo");
    numerosPalavraComVogal("Ola mundo, tudo bem?");
    numerosPalavraComVogal("Ola mundo, tudo bem? Eu estou bem");
  }


  public static void numerosPalavraComVogal(String text){
    String[] words = text.split(" ");
    int count = 0;
    for (String word : words) {
      if (word.matches(".*[aeiou].*")) {
        count++;
      }
    }
    System.out.println(count);
  }

 
}

