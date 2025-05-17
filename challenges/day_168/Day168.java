
public class Day168 {

    public static void main(String[] args) {
        String s = "Apenas um teste para verificar o maior número de letras em uma palavra";
        maiorNumeroDeLetras(s);
    }

    public static void maiorNumeroDeLetras(String s){
        String[] palavras = s.split(" ");
        String maiorPalavra = "";
        int maiorTamanho = 0;

        for (String palavra : palavras) {
            if (palavra.length() > maiorTamanho) {
                maiorTamanho = palavra.length();
                maiorPalavra = palavra;
            }
        }

        System.out.println("A palavra com o maior número de letras é: " + maiorPalavra);
    }
}
