# Day 157

## Desafio:

Implemente um programa Java que leia duas listas de números e imprima a interseção entre elas.	

**Resultado:**

```java


public class Day157 {

    public static void main(String[] args) {
        int[] lista1 = {1, 2, 3, 4, 5};
        int[] lista2 = {3, 4, 5, 6, 7};

        leituraDeDuasListaeInterseção(lista1, lista2);
    }

    public static void leituraDeDuasListaeInterseção(int[] lista1, int[] lista2) {
        int i = 0;
        int j = 0;
        int interseccao = 0;

        while (i < lista1.length && j < lista2.length) {
            if (lista1[i] == lista2[j]) {
                interseccao++;
                i++;
                j++;
            } else if (lista1[i] < lista2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("A interseção tem " + interseccao + " elementos.");
    }

}