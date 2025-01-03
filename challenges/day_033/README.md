# Day 33

## Desafio:

	Crie um programa Java que imprima o padrão de estrelas (triângulo) usando loops for.

**Resultado:**

```java
 public class Day033 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
