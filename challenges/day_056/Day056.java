import java.util.Arrays;
import java.util.Collections;

public class Day056 {

    public static void main(String[] args) {
        Day055 numeros = new Day055();
        numeros.palindromo(11);
        }

    public void numeroPalindromo(int numero) {
        String numeroString = Integer.toString(numero);
        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();

        if (numeroString.equals(numeroInvertido)) {
            System.out.println("O número " + numero + " é um palíndromo.");
        } else {
            System.out.println("O número " + numero + " não é um palíndromo.");
        }
    }

}
