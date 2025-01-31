import java.util.Arrays;

public class Day060 {
    
    public static void main(String[] args) {
        NumeroPrimos(2);
        NumeroPrimos(3);
        NumeroPrimos(5);
        NumeroPrimos(12);
        NumeroPrimos(21);
    }

    public static void NumeroPrimos(int n) {
        System.out.println("Números primos até " + n + ":");
            for (int primo = 2; primo <= n; primo++) {
                if (isPrimo(primo)) {
                    System.out.println("Primo: " + primo);
                }
                else {
                    System.out.println("Não é primo: " + primo);
                }
            }
     
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

}
