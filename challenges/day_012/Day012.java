public class Day012 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        int num = 0;

        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        
        System.out.println("Soma dos valores: " + num);

    }
    
}

