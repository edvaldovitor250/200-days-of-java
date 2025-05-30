
public class Day181 {

    public static void main(String[] args) {
        determinadorUimodal(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1});
    }

    public static void determinadorUimodal(int[] vetor) {
        int n = vetor.length;
        if (n < 3) {
            System.out.println("NAO");
            return;
        }

        int i = 0;

        while (i < n - 1 && vetor[i] < vetor[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            System.out.println("NAO");
            return;
        }

        while (i < n - 1 && vetor[i] > vetor[i + 1]) {
            i++;
        }

        if (i == n - 1) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

    }
}