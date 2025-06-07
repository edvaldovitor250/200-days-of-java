
import java.util.List;


public class Day189 {

    public static void main(String[] args) {
        List<String> palavras = List.of("cachorro", "gato", "cachorro", "passaro", "gato", "gato");
        palavrasRepetidas(palavras);
    }

    public static void palavrasRepetidas(List<String> palavras){
        if (palavras == null || palavras.isEmpty()) {
            System.out.println("Lista vazia ou nula.");
            return;
        }

        int count = 0;
        String palavraAnterior = palavras.get(0);

        for (String palavra : palavras) {
            if (palavra.equals(palavraAnterior)) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("A palavra '" + palavraAnterior + "' se repete " + count + " vezes.");
                }
                palavraAnterior = palavra;
                count = 1;
            }
        }

        if (count > 1) {
            System.out.println("A palavra '" + palavraAnterior + "' se repete " + count + " vezes.");
        }
    }

}