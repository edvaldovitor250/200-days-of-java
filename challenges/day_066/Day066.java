
public class Day066 {

    public static void main(String[] args) {
        String[] strings = {"", "a", "b", "", "c", "d", "", "e", "f"};
        removendoSringsVazia(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    
    public static void removendoSringsVazia(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null || strings[i].isEmpty()) {
                strings[i] = null;
            }
        }
    }
}
