# Day 147

## Desafio:

Crie um programa Java que leia um array de números e verifique se ele é um heap.	

**Resultado:**

```java

public class Day147 {

    public static void verifiqueHeap(int[] heap) {
        int n = heap.length;
        for (int i = 0; i < n; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < n && heap[i] > heap[left]) {
                System.out.println("Heap property violated at index " + i);
                return;
            }
            if (right < n && heap[i] > heap[right]) {
                System.out.println("Heap property violated at index " + i);
                return;
            }
        }
        System.out.println("Heap property is satisfied.");
    }
    public static void main(String[] args) {
        int[] heap = {10, 20, 30, 40, 50, 60, 70};
        verifiqueHeap(heap);
    }

}
