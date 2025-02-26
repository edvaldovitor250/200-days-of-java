# Day 89

## Desafio:

Escreva um programa Java que leia uma lista de números e remova todos os duplicados.

**Resultado:**

```java

public class Day089 {

    public static void main(String[] args) {
        removarNumerosDuplicados(1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 2, 10);
    }

    public static void removarNumerosDuplicados(int... n){
        int[] numeros = new int[n.length];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < numeros.length; j++) {
                if (n[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numeros[index] = n[i];
                index++;
            }
        }
        System.out.println("Numeros sem duplicados:");
        for (int i = 0; i < index; i++) {
            System.out.print(numeros[i] + " ");
        }

    }


}

