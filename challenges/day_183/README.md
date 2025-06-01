# Day 183

## Desafio:

Crie um programa Java que leia uma lista de palavras e determine o maior palíndromo que pode ser formado concatenando palavras.	

**Resultado:**

```java


public class Day183 {

    public static void main(String[] args) {
        String[] palavras = {"radar", "level", "hello", "world", "madam", "racecar", "noon"};
        palindromo(palavras);
    }
    
    public static void palindromo(String[] palavras) {
        String maiorPalindromo = "";
        
        for (String palavra : palavras) {
            if (isPalindromo(palavra) && palavra.length() > maiorPalindromo.length()) {
                maiorPalindromo = palavra;
            }
        }
        
        System.out.println("Maior palíndromo encontrado: " + maiorPalindromo);
    }
    public static boolean isPalindromo(String palavra) {
        int left = 0;
        int right = palavra.length() - 1;
        
        while (left < right) {
            if (palavra.charAt(left) != palavra.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }


}