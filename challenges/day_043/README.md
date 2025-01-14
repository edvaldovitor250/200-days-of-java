# Day 43

## Desafio:

	Implemente um programa Java que leia um número e calcule sua raiz quadrada. Use try/catch para tratar entradas inválidas.

**Resultado:**

```java


public class Day043 {

    public static void main(String[] args) {
        System.out.println(calculeRaizQuadrada(9));
    }

   public static int calculeRaizQuadrada(int n) {
      return (int) Math.sqrt(n);
   }
}


