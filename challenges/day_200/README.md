# Day 199

## Desafio:

Escreva um programa Java que leia um texto e imprima as palavras em ordem de frequência decrescente.

**Resultado:**

```java

public class Day200 {


    public static void main(String[] args) {
        String[] palavras = {"maçã", "banana", "laranja", "maçã", "banana", "maçã"};
        palavrasOrdemFrequencia(palavras);
    }

    public static void palavrasOrdemFrequencia(String[] palavras) {
        java.util.Map<String, Integer> frequencias = new java.util.HashMap<>();
        for (String palavra : palavras) {
            frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
        }
        
        java.util.List<String> listaOrdenada = new java.util.ArrayList<>(frequencias.keySet());
        listaOrdenada.sort((a, b) -> frequencias.get(b).compareTo(frequencias.get(a)));
        
        System.out.println(listaOrdenada);
    }

}