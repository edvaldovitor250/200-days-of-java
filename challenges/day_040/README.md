# Day 40

## Desafio:

	Implemente um programa Java que calcule a soma dos números de 1 a N usando um loop for.

**Resultado:**

```java


public class Day040 {

    public static void main(String[] args) {
        System.out.println(somaNumeros(1, 2, 3, 4, 5));
        System.out.println(somaNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(somaNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }

    public static  int somaNumeros(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

}


