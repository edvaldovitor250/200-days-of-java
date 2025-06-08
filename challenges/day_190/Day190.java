
import java.util.List;


public class Day190 {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        numerosElementosIguais(lista);
    }

    public static void numerosElementosIguais(List<Integer> lista) {
        int count = 0;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    count++;
                }
            }
        }
        System.out.println("Total de pares de elementos iguais: " + count);
    }

}