import java.util.HashMap;
import java.util.Map;

public class Day143 {

    public static void main(String[] args) {
        String texto = "banana apple orange banana apple banana";
        palavraFrequente(texto);
    }

    public static void palavraFrequente(String texto){
        String[] palavras = texto.split(" ");
        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        String palavraMaisFrequente = null;
        int maxFrequencia = 0;

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maxFrequencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }

}
