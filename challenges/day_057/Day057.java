import java.util.Arrays;

public class Day057 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5,5,5};
        int n = Arrays.stream(arr).max().getAsInt();

        System.out.println(n);

        int[] freq = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        
        System.out.println(Arrays.toString(freq));

        }

    

}
