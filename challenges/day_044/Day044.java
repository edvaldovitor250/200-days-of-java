
public class Day044 {

    public static void main(String[] args) {
        System.out.println(converterParaBinario(10));
    }

   public static double converterParaBinario(int numero) {
        return Integer.parseInt(Integer.toBinaryString(numero));
    }

}


