# Day 170

## Desafio:

Escreva um programa Java que leia uma matriz e determine se ela é uma matriz diagonalmente dominante.	

**Resultado:**

```java


public class Day170 {

public static void main(String[] args) {
    int[][] matriz = {
            {4, 1, 2},
            {3, 5, 1},
            {1, 2, 6}
    };

    verificadorDiagonalmenteDominante(matriz);
}


public static void verificadorDiagonalmenteDominante(int[][] matriz) {
    int linhas = matriz.length;
    int colunas = matriz[0].length;

    for (int i = 0; i < linhas; i++) {
        int somaLinha = 0;
        for (int j = 0; j < colunas; j++) {
            if (i != j) {
                somaLinha += Math.abs(matriz[i][j]);
            }
        }
        if (Math.abs(matriz[i][i]) <= somaLinha) {
            System.out.println("A matriz não é diagonalmente dominante.");
            return;
        }
    }
    System.out.println("A matriz é diagonalmente dominante.");

}
}
