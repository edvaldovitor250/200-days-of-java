
public class Day105 {

    public static void main(String[] args) {
        removendoTextAfabetico("123abc456def");
    }

    public static void removendoTextAfabetico(String text) {
        String newText = text.replaceAll("[a-zA-Z]", "");
        System.out.println(newText);
    }
    
}
