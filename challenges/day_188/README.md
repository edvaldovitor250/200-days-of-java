# Day 188

## Desafio:

Escreva um programa Java que leia uma lista de números e imprima os números que são divisíveis por dois números distintos.	

**Resultado:**

```java


import java.util.List;


public class Day188 {

     public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 5, 2, 20, 4, 8);
        List<Integer> resultado = divisiveisDistintos(numeros);
        System.out.println(resultado); 
    }
    
    
    public static List<Integer> divisiveisDistintos(List<Integer> numeros) {
        return numeros.stream()
                      .filter(n -> numeros.stream().filter(m -> !m.equals(n) && n % m == 0).count() == 0)
                      .distinct()
                      .toList();
    }

    

}