# Day 21

## Desafio:

Crie um programa Java que ordene uma lista de strings alfabeticamente usando loops.

**Resultado:**

```java

import java.util.Arrays;

public class Day021 {
    
   // Crie um programa Java que
     //ordene uma lista de strings alfabeticamente
     // usando loops.

    public static void main(String[] args) {

        String[] nomes = {"Maria", "João", "José", "Ana", "Carlos"};
        Arrays.sort(nomes);

         System.out.println("Nomes ordenados alfabeticamente: " +  Arrays.toString(nomes));
        
    }

}
