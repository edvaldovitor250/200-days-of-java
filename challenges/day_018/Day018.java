import java.util.Scanner;

public class Day018 {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String original = scanner.nextLine();

        String cleaned = original.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("A string \"" + original + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + original + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
