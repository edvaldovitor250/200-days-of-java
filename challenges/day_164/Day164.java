import java.util.*;

public class Day164 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números separados por espaço:");
        String[] entrada = scanner.nextLine().split(" ");

        for (String valor : entrada) {
            try {
                numeros.add(Integer.parseInt(valor));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido ignorado: " + valor);
            }
        }

        long produto = 1;
        boolean possuiPrimos = false;

        for (int numero : numeros) {
            if (ehPrimo(numero)) {
                produto *= numero;
                possuiPrimos = true;
            }
        }

        if (possuiPrimos) {
            System.out.println("Produto dos números primos: " + produto);
        } else {
            System.out.println("Nenhum número primo encontrado.");
        }

        scanner.close();
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
