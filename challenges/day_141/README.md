# Day 141

## Desafio:

Crie um programa Java que leia uma lista de palavras e encontre a maior cadeia de palavras que podem ser concatenadas.	

**Resultado:**

```java

public class Day141 {

    public static void main(String[] args) {
        String[] palavras = {"a", "b", "c", "d", "e"};
        cadeiaPalavrasConcatenadas(palavras);
    }
    public static void cadeiaPalavrasConcatenadas(String[] palavras) {
        int n = palavras.length;
        boolean[] visitado = new boolean[n];
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                resultado.append(palavras[i]);
                visitado[i] = true;
            }
        }

        System.out.println(resultado.toString());
    }


}
