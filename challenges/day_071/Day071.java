public class Day071 {

    public static void main(String[] args) {
        textoMaisLongo("O rato roeu a roupa do rei de roma");
        menorTexto("Os rato roeu a roupa do rei de roma");
    }


    static void textoMaisLongo(String texto) {
        String[] palavras = texto.split(" ");
        String maiorPalavra = "";
        for (String palavra : palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }
        System.out.println(maiorPalavra);
    }	

    static void menorTexto(String texto){
        String[] palavras = texto.split(" ");
        String menorPalavra = palavras[0];
        for (String palavra : palavras) {
            if (palavra.length() < menorPalavra.length()) {
                menorPalavra = palavra;
            }
        }
        System.out.println(menorPalavra);

    }

   
}
