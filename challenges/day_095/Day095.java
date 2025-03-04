import java.util.Arrays;

public class Day095 {

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        ordemArrayNumeros(array);

        String[] arrayTexto = {"banana", "abacaxi", "laranja", "uva", "manga"};
        ordemArrayTexto(arrayTexto);
    }

    public static void ordemArrayNumeros(int[] array){
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void ordemArrayTexto(String[] array){
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

}

