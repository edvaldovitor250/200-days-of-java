import java.util.*;

public class Day165 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();
        
        texto = texto.replaceAll("[^a-zA-ZÀ-ÿ\\s]", "").toLowerCase();

        String[] palavras = texto.split("\\s+");
        Map<String, Integer> frequencia = new LinkedHashMap<>();

        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        StringBuilder resultado = new StringBuilder();
        for (String palavra : palavras) {
            if (frequencia.get(palavra) > 1) {
                resultado.append(palavra).append(" ");
            }
        }

        // Exibe o resultado
        System.out.println("Texto filtrado:");
        System.out.println(resultado.toString().trim());

        scanner.close();
    }
}
