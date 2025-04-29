

public class Day150 {

public static void main(String[] args) {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    canBeFormatted(words);
}


public static void canBeFormatted(String[] words) {
    String[] keyboardRows = {
        "qwertyuiop",
        "asdfghjkl",
        "zxcvbnm"
    };

    for (String word : words) {
        boolean canBeFormatted = false;
        for (String row : keyboardRows) {
            if (canBeFormatted(word, row)) {
                canBeFormatted = true;
                break;
            }
        }
        if (canBeFormatted) {
            System.out.println(word);
        }
    }

}

private static boolean canBeFormatted(String word, String row) {

    for (char c : word.toCharArray()) {
        if (row.indexOf(Character.toLowerCase(c)) == -1) {
            return false;
        }
    }
    return true;
}

}