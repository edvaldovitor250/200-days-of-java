public class Day034 {

    public static void main(String[] args) {
        
        int numero1 = 12;
        int numero2 = 18;
        calcularMDC(numero1, numero2);
    }

    public static void calcularMDC(int numero1, int numero2) {
        int resto = numero1 % numero2;
        if (resto == 0) {
            System.out.println("O MDC é: " + numero2);
        } else {
            calcularMDC(numero2, resto);
        }
    }
}
