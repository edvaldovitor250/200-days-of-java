
public class Day042 {

    public static void main(String[] args) {
        contadorDeLetras("O rato roeu a roupa do rei de Roma");
    }

    public static void contadorDeLetras(String s) {
        int caracteres = s.length();
        int palavras = s.split(" ").length;
        int linhas = s.split("\n").length;

        System.out.println("Caracteres: " + caracteres);
        System.out.println("Palavras: " + palavras);
        System.out.println("Linhas: " + linhas);
    }
}


