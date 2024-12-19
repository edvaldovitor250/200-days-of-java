# Day 17

## Desafio:

		Implemente um programa Java que calcule a média de uma lista de números usando foreach.

**Resultado:**

```java

import java.util.List;

public class Day017 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.size();

        System.out.println("A média é: " + media);
    }
}
