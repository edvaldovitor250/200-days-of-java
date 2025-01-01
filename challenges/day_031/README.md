# Day 31

## Desafio:

		Implemente um programa Java que encontre o segundo maior número em um array usando for.

**Resultado:**

```java

public class Day031 {

    public static void main(String[] args) {

        int[] numero = {1, 3, 2, 4, 2};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > maior) {
                segundoMaior = maior;
                maior = numero[i];
            } else if (numero[i] > segundoMaior && numero[i] < maior) {
                segundoMaior = numero[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}
