public class Day163 {

    public static void main(String[] args) {
        letrasRepitidas("aaabbbccdddeee");
    }

    public static void letrasRepitidas(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        char lastChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                count++;
            } else {
                result.append(count).append(lastChar);
                lastChar = str.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(lastChar);
        System.out.println(result.toString());
    }

}
