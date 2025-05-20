
public class Day172 {

    public static void main(String[] args) {
        verificadorAritmética(12);
    }

    public static void verificadorAritmética(int n){
        int soma = 0;
        int i = 1;
        while (i < n) {
            soma += i;
            i++;
        }

        System.err.println("A soma dos números de 1 a " + n + " é: " + soma);

    }
}
