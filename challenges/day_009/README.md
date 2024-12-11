# Day 9

## Desafio:

Implemente um programa Java que ordene um array de números usando um loop for.

**Resultado:**

```java

import java.util.Arrays;

public class Day009 {
    
    public static void main(String[] args) {

        int [] valor = {2,4,16,56,3};
        Arrays.sort(valor);

        for (int i = 0; i < valor.length; i++){
            System.out.println("Valor na posicao " + i + ": " + valor[i]);
        }
     
    }
}

