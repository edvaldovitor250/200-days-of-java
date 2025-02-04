# Day 65

## Desafio:

Escreva um programa Java que leia um array de números e encontre o segundo menor elemento.

**Resultado:**

```java



public class Day065 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        int[] minMax = getMinMax(arr);
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }

    public static int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }
}
