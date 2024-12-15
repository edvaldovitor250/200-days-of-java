import java.util.Scanner;

public class Day014 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            int numero = scanner.nextInt();

            System.out.println("Numero Digitado: " + numero);
       
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

