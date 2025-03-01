public class Day091 {

    public static void main(String[] args) {
        divisoresDoNumeros(10);
    }


        public static void divisoresDoNumeros(int n){
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
}

