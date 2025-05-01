# Day 153

## Desafio:

Crie um programa Java que leia um número e imprima sua representação em palavras.	

**Resultado:**

```java

public class Day153 {

    public static void main(String[] args) {
        String palavra = "palavra";
        represetacaoPalavras(palavra);
    }

    public static void represetacaoPalavras(String palavra){
        String[] letras = palavra.split("");
        StringBuilder sb = new StringBuilder();
        for (String letra : letras) {
            sb.append(letra);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}