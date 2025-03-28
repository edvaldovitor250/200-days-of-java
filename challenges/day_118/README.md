# Day 118

## Desafio:

Implemente um programa Java que leia uma lista de números e calcule o menor intervalo entre dois números consecutivos.		

**Resultado:**

```java


public class Day118{

    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5};
        calcularIntervalosEntresNumero(numeros);

    }

    public static void calcularIntervalosEntresNumero(int...n){
        int intervalo = 0;
        for (int i = 0; i < n.length - 1; i++) {
            intervalo = n[i + 1] - n[i];
            System.out.println("Intervalo entre " + n[i] + " y " + n[i + 1] + " es: " + intervalo);
        }
    }

}
