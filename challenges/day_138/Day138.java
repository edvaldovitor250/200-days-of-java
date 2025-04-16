public class Day138 {

    public static void main(String[] args) {
        String str = "aabbccddeeffgghhii";
        removendoAparecemApenasUmVez(str);
    }

    public static void removendoAparecemApenasUmVez(String str) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[256]; 

        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (char c : str.toCharArray()) {
            if (count[c] == 1) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }


}
