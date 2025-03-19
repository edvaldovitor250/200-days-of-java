
public class Day110 {

    public static void main(String[] args) {
        tresUltimoNumeroMenores();
    }

    public static void tresUltimoNumeroMenores(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tresUltimos = new int[3];
        int j = 0;
        for (int i = numeros.length - 1; i > numeros.length - 4; i--) {
            tresUltimos[j] = numeros[i];
            j++;
        }
        for (int i = 0; i < tresUltimos.length; i++) {
            System.out.println(tresUltimos[i]);
        }
    }


}
