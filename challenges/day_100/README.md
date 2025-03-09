# Day 100

## Desafio:

Implemente um programa Java que leia uma lista de números e calcule o quadrado de cada número.	

**Resultado:**

```java


public class Day100 {

    public static void main(String[] args) {
        quadradoNumeros(5);
    }

    public static void quadradoNumeros(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + i*i);
        }
    }
    
}
