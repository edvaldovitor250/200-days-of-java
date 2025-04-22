
public class Day144 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        maiorSequentenCrescente(arr);
    }


    public static void maiorSequentenCrescente(int[] arr) {
        int maior = 0;
        int sequencia = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] > arr[i - 1]) {
                sequencia++;
            } else {
                sequencia = 1;
            }
            if (sequencia > maior) {
                maior = sequencia;
            }
        }
        System.out.println(maior);
    }


}
