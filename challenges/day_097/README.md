# Day 97

## Desafio:

	Implemente um programa Java que leia uma lista de números e calcule o produto de todos os números.

**Resultado:**

```java


public class Day097 {
    public static void main(String[] args) {
        calculoNumeros(1, 2, 3, 4, 5);
    }

    public static void calculoNumeros(int ... n){
        int suma = 0;
        int resta = 0;
        int multiplicacion = 1;
        int division = 1;
        for (int i = 0; i < n.length; i++) {
            suma += n[i];
            resta -= n[i];
            multiplicacion *= n[i];
            division /= n[i];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

}

