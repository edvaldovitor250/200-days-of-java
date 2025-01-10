
public class Day040 {

    public static void main(String[] args) {
        System.out.println(somaNumeros(1, 2, 3, 4, 5));
        System.out.println(somaNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(somaNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }

    public static  int somaNumeros(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

}


