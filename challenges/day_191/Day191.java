
import java.util.List;


public class Day191 {

    public static void main(String[] args) {
        List<String> input = List.of(
            "1,2,3,4,5",
            "6,7,8,9,10",
            "11,12,13,14,15"
        );

        int sum = input.stream()
                       .flatMap(line -> List.of(line.split(",")).stream())
                       .mapToInt(Integer::parseInt)
                       .sum();

        System.out.println("The sum of all numbers is: " + sum);
    }

}