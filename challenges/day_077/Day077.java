public class Day077 {

public static void main(String[] args) {
    int[] n = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
    removendoNumerosNegativos(n);
}

public static void removendoNumerosNegativos(int[] n) {
    int[] n2 = new int[n.length];
    int j = 0;
    for (int i = 0; i < n.length; i++) {
        if (n[i] >= 0) {
            n2[j] = n[i];
            j++;
        }
    }
    for (int i = 0; i < j; i++) {
        System.out.print(n2[i] + " ");
    }	
}

}