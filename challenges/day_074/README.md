# Day 74

## Desafio:

	Crie um programa Java que leia um array de números e imprima os pares e ímpares separadamente
    
**Resultado:**

```java

public class Day074 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numerosParesEIMpares(numeros);
    }

    public static void numerosParesEIMpares(int[] numeros) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

}
