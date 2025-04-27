public class Day149 {

    public static void main(String[] args) {
        String text = "Hello world. This is a test. How many sentences are there?";
        contadorLetras(text);
    }

    public static void contadorLetras(String texto){
        int contador = 0;
        String[] frases = texto.split("[.!?]");
        for (String frase : frases) {
            contador += frase.length(); 
        }
        System.out.println("Número total de letras: " + contador);
    }

}
