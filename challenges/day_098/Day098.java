import java.util.ArrayList;
import java.util.List;

public class Day098 {

    public static void main(String[] args) {
        List<String> texto = new ArrayList<>();
        texto.add("Hola");
        texto.add("Mundo");
        texto.add("Java");
        texto.add("Programacion");
        texto.add("Facil");
        inversarString(texto);
    }

    public static void inversarString (List<String> texto){
        for (int i = texto.size() - 1; i >= 0; i--) {
            System.out.println(texto.get(i));
        }
    }


}

