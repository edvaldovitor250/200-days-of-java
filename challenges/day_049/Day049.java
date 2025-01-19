public class Day049 {

    public static void main(String[] args) {
        findNumber(1, 2, 3, 4, 5);
    }

    public static void findNumber(double ... numbers) {

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("The average is: " + average);
    }


}
