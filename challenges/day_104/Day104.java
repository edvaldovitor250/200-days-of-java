
public class Day104 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(calcularMVC(arr));
    }

    public static Integer calcularMVC(int[] arr) {
        int mvc = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                if (diff > mvc) {
                    mvc = diff;
                }
            }
        }
        return mvc;
    }


}
