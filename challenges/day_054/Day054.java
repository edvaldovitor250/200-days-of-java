import java.util.Arrays;
import java.util.Collections;

public class Day054 {

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5, 6};

        Arrays.sort(numeros, Collections.reverseOrder());

        int[] sortedNumeros = Arrays.stream(numeros).mapToInt(Integer::intValue).toArray();

        int result = binarySearchIterative(sortedNumeros, 3);

        System.out.println("Posição do número 3 no array: " + result);
    }

    public static int binarySearchIterative(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == num) {
                return mid; 
            } else if (arr[mid] < num) {
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
