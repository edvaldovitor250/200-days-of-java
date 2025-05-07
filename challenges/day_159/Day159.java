public class Day159 {

    public static void main(String[] args) {
        String[] palavras = {"arara", "banana", "civic", "deified", "level"};
        palavrasPalindromas(palavras);

    };


    public static void palavrasPalindromas(String[] palavras) {
        for (String palavra : palavras) {
            String palavraInvertida = new StringBuilder(palavra).reverse().toString();
            if (palavra.equalsIgnoreCase(palavraInvertida)) {
                System.out.println(palavra + " é um palíndromo.");
            } else {
                System.out.println(palavra + " não é um palíndromo.");
            }
        }
    }
}