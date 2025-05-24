# Day 175

## Desafio:

Implemente um programa Java que leia uma matriz e calcule a soma dos elementos das bordas.	

**Resultado:**

```java

public class Day175 {

    public static void main(String[] args) {
        somarBordas(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
    }

    public static void somarBordas(int[][] matriz){
        int soma = 0;
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos das bordas é: " + soma);
    }

}