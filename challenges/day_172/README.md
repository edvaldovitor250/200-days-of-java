# Day 172

## Desafio:

Implemente um programa Java que leia uma lista de números e determine se eles podem formar uma progressão aritmética.	

**Resultado:**

```java

public class Day172 {

    public static void main(String[] args) {
        verificadorAritmética(12);
    }

    public static void verificadorAritmética(int n){
        int soma = 0;
        int i = 1;
        while (i < n) {
            soma += i;
            i++;
        }

        System.err.println("A soma dos números de 1 a " + n + " é: " + soma);

    }
}
