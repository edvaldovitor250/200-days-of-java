# Day 105

## Desafio:

Crie um programa Java que leia um texto e remova todos os caracteres não alfabéticos.

**Resultado:**

```java

public class Day105 {

    public static void main(String[] args) {
        removendoTextAfabetico("123abc456def");
    }

    public static void removendoTextAfabetico(String text) {
        String newText = text.replaceAll("[a-zA-Z]", "");
        System.out.println(newText);
    }
    
}
