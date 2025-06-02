
public class Day184 {

        public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        somaDosElementosImpares(numeros);
    }

    public static void somaDosElementosImpares(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                soma += numero;
            }
        }
        System.out.println("Soma dos elementos ímpares: " + soma);
    }

}