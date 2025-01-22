# Day 50

## Desafio:

Escreva um programa Java que leia uma matriz e imprima a soma de cada linha.

**Resultado:**

```java

public class Day050 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < linhas; i++) {
            int soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + soma);
        }

        scanner.close();
    }


}
