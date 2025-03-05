# Day 96

## Desafio:

Crie um programa Java que leia uma lista de palavras e imprima as palavras que são palíndromos.

**Resultado:**

```java


public class Day096 {

    public static void main(String[] args) {
        palavraPalindromos("ovo");
        palavraPalindromos("arara");
        palavraPalindromos("casa");
        palavraPalindromos("radar");
        palavraPalindromos("palavra");
        palavraPalindromos("palindromo");
        palavraPalindromos("palindromopalindromo");
        palavraPalindromos("palindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromo");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromop");
        palavraPalindromos("palindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromopalindromo");
    }

    public static void palavraPalindromos(String palavra) {
        if (palavra == null || palavra.isEmpty()) {
            System.out.println("A palavra está vazia ou nula.");
            return;
        }

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

    }
}

