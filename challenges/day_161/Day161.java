public class Day161 {

    public static void midirPalavra(String palavra) {
        StringBuilder palavraInvertida = new StringBuilder(palavra);
        palavraInvertida.reverse();
        if (palavra.equalsIgnoreCase(palavraInvertida.toString())) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }
    public static void main(String[] args) {
        String palavra = "arara";
        midirPalavra(palavra);
    }
}
