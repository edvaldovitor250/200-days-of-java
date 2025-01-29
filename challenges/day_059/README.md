# Day 59

## Desafio:

Escreva um programa Java que leia os números de um arquivo e calcule a média.

**Resultado:**

```java

import java.util.Random;

public class Day059 {

    public static void main(String[] args) {
        Day059 day059 = new Day059();
        Random random = new Random();
        double[] notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextDouble() * 10;
        }
        System.out.println(day059.calculoMedia(notas));
    }
    

    public double calculoMedia(double... notas){

        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media / notas.length;

    }
}
