# Day 198

## Desafio:

Crie um programa Java que leia um array de números e imprima o comprimento do menor subarray que contém todos os números únicos.	

**Resultado:**

```java


public class Day198 {

        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        subarraySum(arr, target);
    }

    public static void subarraySum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("No subarray with the given sum found.");
    }

}