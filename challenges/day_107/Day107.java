
public class Day107 {

    public static void main(String[] args) {
        numeroPerfeitoMenosEle(28);
    }

    public static void numeroPerfeitoMenosEle(int n ){
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n) {
            System.out.println("O número " + n + " é perfeito");
        } else {
            System.out.println("O número " + n + " não é perfeito");
        }
        System.out.println("A soma dos divisores de " + n + " é " + soma);

    }


}
