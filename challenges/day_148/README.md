# Day 148

## Desafio:

Implemente um programa Java que leia uma lista de números e encontre o maior produto de três números consecutivos.	

**Resultado:**

```java

public class Day148 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
        System.out.println(maiorNumeroConsecutivos(arr)); 
    }

    public static int maiorNumeroConsecutivos(int[] arr) {
        int maior = 0;
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cont++;
            } else {
                if (cont > maior) {
                    maior = cont;
                }
                cont = 0;
            }
        }
        return Math.max(maior, cont);
    }

}
