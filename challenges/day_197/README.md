# Day 197

## Desafio:

Escreva um programa Java que leia um texto e remova todas as palavras que contêm números.	

**Resultado:**

```java

public class Day197 {

       public static void main(String[] args) {
        String[] palavras = {
            "casa1", "carro", "123abc", "teste", "hello2world", "java3"
        };
        
        System.out.println("Palavras que contêm números:");
        palavrasQueContemNumeros(palavras);
    }
    
    public static void palavrasQueContemNumeros(String[] palavras) {
        for (String palavra : palavras) {
            if (palavra.matches(".*\\d.*")) {
                System.out.println(palavra);
            }
        }
    }
}