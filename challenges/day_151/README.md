# Day 151

## Desafio:

Implemente um programa Java que leia uma lista de palavras e imprima as palavras que podem ser formadas com letras de uma linha do teclado.	

**Resultado:**

```java


public class Day151 {

public static void main(String[] args) {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    canBeFormatted(words);
}


public static void canBeFormatted(String[] words) {
    String[] keyboardRows = {
        "qwertyuiop",
        "asdfghjkl",
        "zxcvbnm"
    };

    for (String word : words) {
        boolean canBeFormatted = false;
        for (String row : keyboardRows) {
            if (canBeFormatted(word, row)) {
                canBeFormatted = true;
                break;
            }
        }
        if (canBeFormatted) {
            System.out.println(word);
        }
    }

}

private static boolean canBeFormatted(String word, String row) {

    for (char c : word.toCharArray()) {
        if (row.indexOf(Character.toLowerCase(c)) == -1) {
            return false;
        }
    }
    return true;
}

}