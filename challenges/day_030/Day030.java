import java.util.LinkedList;
import java.util.Queue;

public class Day030 {
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        int max = numeros.peek();
        int min = numeros.peek();

        for (int numero : numeros) {
            max = Math.max(max, numero); 
            min = Math.min(min, numero);
        }

        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}