public class Day158 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        verificadorCircularmenteOrdenado(arr);
    }

    public static void verificadorCircularmenteOrdenado(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i + 1) % n]){
                count++;
            }
        }

        if(count > n){
            System.out.println("Array não é circularmente ordenado");
        } else {
            System.out.println("Array é circularmente ordenado");
        }

    }

}