# Day 123

## Desafio:

Crie um programa Java que leia uma lista de números e agrupe os números pares e ímpares em sublistas.	

**Resultado:**

```java
public class Day123{

public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    agrupeImparesEpares(numeros);
}

public static void agrupeImparesEpares(int[] numeros) {
    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();

    for (int numero : numeros) {
        if (numero % 2 == 0) {
            pares.add(numero);
        } else {
            impares.add(numero);
        }
    }

    System.out.println("Números Pares: " + pares);
    System.out.println("Números Ímpares: " + impares);
  
}

}
