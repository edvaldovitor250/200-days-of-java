# Day 58

## Desafio:

Implemente um programa Java que gere números aleatórios entre 1 e 100 e os armazene em um arquivo.

**Resultado:**

```java

import java.util.Random;

public class Day058 {
    public static void main(String[] args) {

        Random random = new Random();
        
        int aleatorios = random.nextInt(100);
        
        System.out.println("Número aleatorio: " + aleatorios);
    }
}
