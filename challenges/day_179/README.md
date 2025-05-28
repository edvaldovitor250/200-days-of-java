# Day 179

## Desafio:

Escreva um programa Java que leia um array de números e remova os elementos duplicados.	

**Resultado:**

```java


public class Day179 {

    public static void main(String[] args) {
        verificadoNumeroRepetidos(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static void verificadoNumeroRepetidos(int[]numeros){
        int[] contador = new int[10];

        for (int numero : numeros) {
            if (numero >= 0 && numero < 10) {
                contador[numero]++;
            }
        }
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 1) {
                System.out.println("Numero " + i + " se repite " + contador[i] + " vezes.");
            }
        }

    }

}