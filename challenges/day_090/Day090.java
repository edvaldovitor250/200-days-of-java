public class Day090 {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        numeroCrescenteeDescrecente(n);
    }

    public static void numeroCrescenteeDescrecente(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }

}

