# Day 41

## Desafio:

	Escreva um programa Java que gere a tabela de multiplicação de 1 a 10 usando loops for.

**Resultado:**

```java

public class Day041 {

    public static void main(String[] args) {
        tabelaMultiplicacao(5);
    }

    public static void  tabelaMultiplicacao(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        
    }

}


