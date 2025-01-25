import java.util.Arrays;
import java.util.Collections;

public class Day055 {

    public static void main(String[] args) {
        Day055 palavra = new Day055();
        palavra.palavraPorOutra("O rato roeu a roupa do rei de Roma", "A pessoa que fez o churrasco");
    }

    public void palavraPorOutra(String palavra, String outra) {
        System.out.println(palavra.replace(palavra, outra));
    }
}
