# Day 160

## Desafio:

Implemente um programa Java que leia um array de números e determine o número de inversões no array.	

**Resultado:**

```java

public class Day160 {

    public static int contarInversoes(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 5};

        int totalInversoes = contarInversoes(array);
        System.out.println("Número de inversões: " + totalInversoes);
    }
}
