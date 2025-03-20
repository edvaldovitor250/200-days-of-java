
public class Day111 {

    public static void main(String[] args) {
        substituirVogaisPorAsteriscos("Hello World!");
    }

    public static void substituirVogaisPorAsteriscos(String texto) {
        String textoModificado = texto.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(textoModificado);
    }

    
}
