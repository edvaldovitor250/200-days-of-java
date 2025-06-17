# Day 199

## Desafio:

Implemente um programa Java que leia uma lista de palavras e imprima as palavras que podem ser formadas a partir de um conjunto específico de caracteres.

**Resultado:**

```java

public class Day199 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "grape", "kiwi"};
        String characters = "aeiou";

        System.out.println("Palavras que podem ser formadas:");
        for (String word : words) {
            if (canBeFormed(word, characters)) {
                System.out.println(word);
            }
        }
    }

    private static boolean canBeFormed(String word, String characters) {
        for (char c : word.toCharArray()) {
            if (characters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}