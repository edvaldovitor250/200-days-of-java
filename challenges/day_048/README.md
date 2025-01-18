# Day 48

## Desafio:

Crie um programa Java que leia um array de strings e imprima todas as strings que começam com uma letra específica.

**Resultado:**

```java

public class Day048 {

    public static void main(String[] args) {
        String texto = "O rato roeu a roupa do rei de Roma.";
        String letra = "a";

        int resultado = contarLetra(texto, letra);
        System.out.println("A letra '" + letra + "' aparece " + resultado + " vezes no texto.");
    }

    public static int contarLetra(String texto, String letra) {
        int count = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (String.valueOf(texto.charAt(i)).equalsIgnoreCase(letra)) {
                count++;
            }
        }

        return count;
    }
}
