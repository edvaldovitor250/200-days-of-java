public class Day072 {

    public static void main(String[] args) {
        ordemReversa("Hello World!");
    }

    static void ordemReversa(String texto) {
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println(texto);
    }	

}
