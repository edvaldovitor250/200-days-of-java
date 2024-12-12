# Day 11

## Desafio:

Crie um programa Java que use um loop foreach para imprimir todos os elementos de um array.

**Resultado:**

```java

public class Day011 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.println(i);
        }
    }
    
}

