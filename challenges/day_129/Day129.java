public class Day129 {

public static void main(String[] args) {
    String str = "Hello World!";
    todasAsVogais(str);
}
    
public static void todasAsVogais(String str){
    String vogais ="aeiouAEIOU";
    StringBuilder vogaisEncontradas = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (vogais.indexOf(c) != -1) {
            vogaisEncontradas.append(c);
        }
    }
    if (vogaisEncontradas.length() == 0) {
        System.out.println("Nenhuma vogal encontrada.");
    } else {
        System.out.println("Vogais encontradas: " + vogaisEncontradas.toString());
    }
}

}
