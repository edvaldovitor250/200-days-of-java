public class Day145 {


    public static void HarshadMenores(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            int soma = 0;
            int temp = i;

            while (temp > 0) {
                soma += temp % 10;
                temp /= 10;
            }

            if (i % soma == 0) {
                count++;
                System.out.println(i + " é Harshad");
            } else {
                System.out.println(i + " não é Harshad");
            }
        }

        System.out.println("Quantidade de números Harshad menores que " + n + ": " + count);
    }

}
