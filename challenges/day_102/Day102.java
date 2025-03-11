
public class Day102 {

    public static void main(String[] args) {
        tabuadaPorNumero(5);
    }

    public static void tabuadaPorNumero(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }


}
