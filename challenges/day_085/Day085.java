public class Day085 {

  public static void main(String[] args) {
    int[] arr = {4, 2, 4, 5, 2, 3, 1};
    elementosRepetidos(arr);
  }


  public static void elementosRepetidos(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          break;
        }
      }
      if (i == j) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}

