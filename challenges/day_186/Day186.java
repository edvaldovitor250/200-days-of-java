

public class Day186 {

    public static void main(String[] args) {
        menorProdutoDeTresNumeros(new int[]{1, 2, 3, 4, 5});
    }

    public static void menorProdutoDeTresNumeros(int[] numeros) {
        if (numeros.length < 3) {
            System.out.println("Array deve conter pelo menos três números.");
            return;
        }

        int menorProduto = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length - 2; i++) {
            for (int j = i + 1; j < numeros.length - 1; j++) {
                for (int k = j + 1; k < numeros.length; k++) {
                    int produto = numeros[i] * numeros[j] * numeros[k];
                    if (produto < menorProduto) {
                        menorProduto = produto;
                    }
                }
            }
        }

        System.out.println("O menor produto de três números é: " + menorProduto);
    }

}