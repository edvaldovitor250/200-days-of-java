public class Day135 {

public static void main(String[] args) {
    int[] numeros = {5, 10, 15};
    calculadoFatoria(numeros);
}

public static void calculadoFatoria(int ... n ){
    for (int i = 0; i < n.length; i++) {
        int fatorial = 1;
        for (int j = 1; j <= n[i]; j++) {
            fatorial *= j;
        }
        System.out.println("Fatorial de " + n[i] + " é: " + fatorial);
    }
    System.out.println("Fatorial de " + n.length + " números foi calculado.");
}
}
