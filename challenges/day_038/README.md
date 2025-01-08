# Day 38

## Desafio:

Escreva um programa Java que leia notas de alunos, calcule a média e determine se o aluno foi aprovado.

**Resultado:**

```java

public class Day038 {

    public static void main(String[] args) {
        calcularMedia(3,4,6,7);
    }
    
    public static double calcularMedia(double ... notas){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

}
