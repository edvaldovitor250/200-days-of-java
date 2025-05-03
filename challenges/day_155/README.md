# Day 155

## Desafio:

Escreva um programa Java que leia uma lista de números e remova todos os múltiplos de um número específico.	

**Resultado:**

```java

public class Day155 {

    public static void multiplyNumeros(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        multiplyNumeros(num1, num2);
    }

}