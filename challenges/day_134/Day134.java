public class Day134 {

    public static void main(String[] args) {
        String text = "Hello World! This is a test string to count letters.";
        contatorDeLetras(text);
    }

    public static void contatorDeLetras(String text){
        int[] contagem = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            if (Character.isLetter(letra)) {
                contagem[Character.toLowerCase(letra) - 'a']++;
            }
        }
        for (int i = 0; i < contagem.length; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + ": " + contagem[i]);
        }
    }
}
