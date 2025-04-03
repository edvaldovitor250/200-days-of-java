# Day 125

## Desafio:

Escreva um programa Java que leia uma lista de números e calcule o número de pares que têm soma igual a um valor específico.

**Resultado:**

```java

import java.util.List;

public class Day125 {

    public static void main(String[] args) {
        List<Integer> pares = List.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        calcularParesValoresEspecifico(pares);
    }

    public static void calcularParesValoresEspecifico(List<Integer> pares){
        for (int iterable_element : pares) {
            for (int i = 0; i < pares.size(); i++) {
                for (int j = i + 1; j < pares.size(); j++) {
                    if (pares.get(i) + pares.get(j) == iterable_element) {
                        System.out.println("Pares encontrados: " + pares.get(i) + " e " + pares.get(j));
                    }
                }
            }
        }
    }

}   