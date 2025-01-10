# Day 39

## Desafio:

Crie um programa Java que implemente uma pilha (stack) usando um array. Use try/catch para tratar erros de overflow/underflow.

**Resultado:**

```java

import java.util.LinkedList;
import java.util.Queue;

public class Day039 {

    public static void main(String[] args) {
        try {
            Queue<Integer> queue = new LinkedList<>();
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int number : numbers) {
                queue.add(number);
            }
            System.out.println(queue);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}


