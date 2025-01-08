# Day 37

## Desafio:

Implemente um programa Java que leia uma lista de strings e conte quantas palavras têm mais de 5 caracteres.

**Resultado:**

```java

public class Day037 {
    public static void main(String[] args) {
        String [] words = {"Hello", "World", "Java", "Programming", "Language", "Challenge"};
        int count = 0;

        for(String word : words) {
            if(word.length() > 5) {
                count++;
            }
        }
        System.out.println("Number of words with more than 5 characters: " + count);
    }
}

