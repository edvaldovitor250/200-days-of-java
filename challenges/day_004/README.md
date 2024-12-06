# Day 4

## Desafio:

Escreva um programa Java que verifique se um número é par ou ímpar e imprima o resultado.

**Resultado:**

```java

import java.util.Scanner;

public class Day004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }

    }
}
