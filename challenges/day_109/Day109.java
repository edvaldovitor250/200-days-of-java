
public class Day109 {
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        uniaoArrays(a, b);
    }

    public static void uniaoArrays(int[]a , int[]b){
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            c[i] = a[j];
            i++;
        }
        for (int j = 0; j < b.length; j++) {
            c[i] = b[j];
            i++;
        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
    }


}
