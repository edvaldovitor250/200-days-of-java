# Day 111

## Desafio:

Crie um programa Java que leia um texto e substitua todas as vogais por asteriscos (*).	

**Resultado:**

```java

public class Day111 {

    public static void main(String[] args) {
        substituirVogaisPorAsteriscos("Hello World!");
    }

    public static void substituirVogaisPorAsteriscos(String texto) {
        String textoModificado = texto.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(textoModificado);
    }

    
}
