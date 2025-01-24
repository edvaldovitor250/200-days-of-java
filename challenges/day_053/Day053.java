import java.util.Arrays;
import java.util.Collections;

public class Day053 {

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5, 6};

        Collections.reverse(Arrays.asList(numeros));

        System.out.println(Arrays.toString(numeros));
    }
       
}
