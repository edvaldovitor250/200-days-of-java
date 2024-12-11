
import java.util.Arrays;

public class Day009 {
    
    public static void main(String[] args) {

        int [] valor = {2,4,16,56,3};
        Arrays.sort(valor);

        for (int i = 0; i < valor.length; i++){
            System.out.println("Valor na posicao " + i + ": " + valor[i]);
        }
     
    }
}

