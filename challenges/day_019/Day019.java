public class Day019 {

    public static void main(String[] args) {
        gerarFibonacci(N);
    }

    public static void gerarFibonacci(int N) {
        if (N <= 0) {
            System.out.println("Por favor, insira um valor maior que 0.");
            return;
        }

        int num1 = 0, num2 = 1;

        System.out.println("Os primeiros " + N + " números da sequência de Fibonacci são:");

        for (int i = 1; i <= N; i++) {
            System.out.print(num1 + " ");

            int proximo = num1 + num2;

            num1 = num2;
            num2 = proximo;
        }
    }
}
