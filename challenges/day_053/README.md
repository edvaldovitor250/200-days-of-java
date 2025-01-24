# Day 53

## Desafio:

Escreva um programa Java que leia um array de números e inverta a ordem dos elementos.

**Resultado:**

```java

import java.util.Arrays;
import java.util.Collections;

public class Day053 {

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5, 6};

        Collections.reverse(Arrays.asList(numeros));

        System.out.println(Arrays.toString(numeros));
    }
       
}
