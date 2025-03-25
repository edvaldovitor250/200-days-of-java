
public class Day116{

    public static void main(String[] args){
        String str = "geeksforgeeks";
        caracteresNaoRepetidos(str);
    }


    public static void caracteresNaoRepetidos(String str){
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++){
            if (count[str.charAt(i)] == 1){
                System.out.print(str.charAt(i));
            }
        }
    }

}
