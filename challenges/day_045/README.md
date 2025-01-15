# Day 45

## Desafio:

	Crie um programa Java que leia um array de números e imprima apenas os números pares.

**Resultado:**

```java


public class Day044 {

    public static void main(String[] args) {
        System.out.println(numerosPares(10));
    }

   public static double numerosPares(int... n) {
        double soma = 0;
        for (int i : n) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return soma;
    }

}


