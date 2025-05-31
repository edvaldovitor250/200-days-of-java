# Day 182

## Desafio:

Escreva um programa Java que leia uma lista de números e imprima o maior produto entre três números não consecutivos.	

**Resultado:**

```java


import java.util.List;

public class Day182 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        leituraDeNumeroNaoConsecutivos(numeros);
    }


public static void leituraDeNumeroNaoConsecutivos(List<Integer>numeber){
    if (numeber.size() < 3){
        System.out.println("A lista deve conter pelo menos três números.");
    }
    int maxProduct = Integer.MIN_VALUE;
    for (int i = 0; i < numeber.size(); i++) {
        for (int j = i + 2; j < numeber.size(); j++) {
            for (int k = j + 2; k < numeber.size(); k++) {
                int product = numeber.get(i) * numeber.get(j) * numeber.get(k);
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
    }
    if (maxProduct == Integer.MIN_VALUE) {
        System.out.println("Não foi possível calcular o produto de três números não consecutivos.");
    } else {
        System.out.println("O maior produto entre três números não consecutivos é: " + maxProduct);
    }
}

}