public class Day133 {

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        somaDeNumeroListaDeQuadrados(lista);
    }

    public static void somaDeNumeroListaDeQuadrados(int[] lista) {
        int soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma += Math.pow(lista[i], 2);
        }
        System.out.println("A soma dos quadrados é: " + soma);
    }

}
