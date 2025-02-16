public class Day076 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        maiorMenor(arr);
    }


    public static void maiorMenor(int[] arr) {
        int maior = arr[0];
        int menor = arr[0];



        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
