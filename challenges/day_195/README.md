# Day 195

## Desafio:

Crie um programa Java que leia um array de números e imprima os elementos que aparecem um número ímpar de vezes.	

**Resultado:**

```java


public class Day195 {

    public static void main(String[] args) {
        int n = 10;
        numerosImpares(n);
    }
    
    public static void numerosImpares(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}