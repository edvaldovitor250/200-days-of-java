
public class Day174 {

    public static void main(String[] args) {
        palavrasMaisLongas("A raposa marrom rápida salta sobre o cachorro preguiçoso");
    }

    public static void palavrasMaisLongas(String text){
      String[] words = text.split(" ");
    
    if (words.length == 0) return;
    
    String longest = words[0];
    String shortest = words[0];
    
    for (String word : words) {
        if (word.length() > longest.length()) {
            longest = word;
        }
        if (word.length() < shortest.length()) {
            shortest = word;
        }
    }
    
    System.out.println("Maior palavra: " + longest);
    System.out.println("Menor palavra: " + shortest);
}
}