import java.util.Scanner;

public class Day052 {

    private static long fatorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    private static long calcularCombinacoes(int n, int k) {
        if (k > n) {
            return 0; 
        }
        long fatorialN = fatorial(n);
        long fatorialK = fatorial(k);
        long fatorialNK = fatorial(n - k);
        return fatorialN / (fatorialK * fatorialNK);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (total de elementos): ");
        int n = scanner.nextInt();
        System.out.print("Digite o valor de K (elementos escolhidos): ");
        int k = scanner.nextInt();

        long combinacoes = calcularCombinacoes(n, k);
        System.out.println("O número de combinações possíveis é: " + combinacoes);

        scanner.close();
    }
}
