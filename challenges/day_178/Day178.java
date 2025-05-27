

public class Day178 {

    public static void main(String[] args) {
        String str = "programacion";
        caracteresRepetidos(str);

    }


    public  static void caracteresRepetidos(String str){
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        System.out.println("Caracteres repetidos:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char)i + " - " + count[i]);
            }
        }
    }

}