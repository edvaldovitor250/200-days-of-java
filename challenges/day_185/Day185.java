

public class Day185 {

    public static void main(String[] args) {
        String texto = "Acordar cedo é importante para ter um dia produtivo";
        palavrasOrdemInversa(texto);
    }


    public static void palavrasOrdemInversa(String texto) {
        String[] palavras = texto.split(" ");
        java.util.Arrays.sort(palavras, java.util.Collections.reverseOrder());
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

}