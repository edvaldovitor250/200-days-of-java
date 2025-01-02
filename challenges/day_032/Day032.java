import java.util.HashMap;
import java.util.Map;

public class Day032 {

   
    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 4, 2, 1, 1, 3, 2};

        int mostFrequent = findMostFrequentNumber(numbers);

        System.out.println("O número que mais se repete é: " + mostFrequent);
    }

    public static int findMostFrequentNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequent;
    }

}

