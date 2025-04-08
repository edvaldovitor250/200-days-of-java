public class Day130{

    public static void main(String[] args) {
        int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numerosFibonacciMenosIguais(n);
        
    }



    public static void numerosFibonacciMenosIguais(int[]n){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0 || n[i] == 1) {
                count++;
            } else {
                int a = 0, b = 1, c = 0;
                while (c < n[i]) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                if (c != n[i]) {
                    count++;
                }
            }
        }

    }

}
