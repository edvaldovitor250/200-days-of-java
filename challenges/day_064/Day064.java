
public class Day064 {

    public static void main(String[] args) {
        contadorDeLetras("Hola mundo vida");
    
    }

    public static void contadorDeLetras(String text) {
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z' && c != ' ') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z' && c != ' ') {
                count[c - 'A']++;
            }
        }
        System.out.println("Contagem de letras:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }

}
