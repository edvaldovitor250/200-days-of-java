
public class Day108 {

    public static void main(String[] args) {
        String texto = "O rato roeu a roupa do rei de Roma";
        conteNumerosDePalavras(texto);
    }

    public static void conteNumerosDePalavras(String texto) {
        String[] palavras = texto.split(" ");
        System.out.println("Número de palavras: " + palavras.length);
    }
}
