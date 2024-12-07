# Day 5

## Desafio:

Crie um método em Java para calcular o fatorial de um número usando um loop for.

**Resultado:**

```java


public class Day005 {
 
    public void Fatorial(int numero){

        if (numero < 0) {
            System.out.println("o Resultado é 1");
            return;
        }

        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat *= i;
            System.out.println("Fatorial de " + numero + ": " + fat);
        }
    }

    public static void main(String[] args) {
        Day005 day005 = new Day005();
        day005.Fatorial(0);
    }


}
