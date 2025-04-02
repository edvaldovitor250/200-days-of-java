public class Day124{

    public static void main(String[] args) {
        maiorTexto("Casa", "Casa", "Casa Grande");
    }

    public static void maiorTexto(String ... texto){
        String maior = texto[0];
        for(String t: texto){
            if(t.length() > maior.length()){
                maior = t;
            }
        }
        System.out.println("O maior texto é: " + maior);
    }



}   