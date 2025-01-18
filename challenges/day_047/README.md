# Day 47

## Desafio:

	Escreva um programa Java que leia um texto e conte quantas vezes uma palavra específica aparece.

**Resultado:**

```java


public class Day047 {
    public static void main(String[] args) {
        String texto = "O rato roeu a roupa do rei de Roma.";
        String palavra = "roeu";
    }

   public static int contarPalavra(String texto, String palavra) {
        String[] palavras = texto.split(" ");
        int contador = 0;
        for (String p : palavras) {
            if (p.equals(palavra)) {
                contador++;
            }
        }
        return contador;
    }
}


