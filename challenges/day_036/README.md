# Day 36

## Desafio:

Crie um programa Java que leia uma lista de números e remova todos os duplicados.

**Resultado:**

```java

public class Day036 {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        int[] numerosSemDuplicados = removeDuplicados(numeros);
        for (int numero : numerosSemDuplicados) {
            System.out.println(numero);
        }
}

    public static int[] removeDuplicados(int[] numeros) {
        int[] numerosSemDuplicados = new int[numeros.length];
        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0 || numeros[i] != numeros[i - 1]) {
                numerosSemDuplicados[j] = numeros[i];
                j++;
            }
        }
        return numerosSemDuplicados;
    }
}
