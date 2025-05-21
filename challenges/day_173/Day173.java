
public class Day173 {

    public static void main(String[] args) {
        removarNumeroMultiplicados(20);
    }

    public static void removarNumeroMultiplicados(int n){
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] % numeros[i] == 0) {
                    numeros[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] != -1) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

}
