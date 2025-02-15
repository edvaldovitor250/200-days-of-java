# Day 75

## Desafio:

Implemente um programa Java que leia um número e calcule a soma dos seus dígitos.	

**Resultado:**

```java


public class Day075 {

    public static void main(String[] args) {
        calculoDosDigitos(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void calculoDosDigitos(int... n) {
        int count = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 10 && n[i] <= 99) {
                count++;
            }
        }
        System.out.println("Numeros de dos digitos: " + count);
    }

}
