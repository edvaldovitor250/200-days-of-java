public class Day081 {

  public static void main(String[] args) {
    palavraMaisDeUmaVez("O rato roeu a roupa do rei de roma");
  }

  public static void palavraMaisDeUmaVez(String text){
    String[] words = text.split(" ");
    for (int i = 0; i < words.length; i++) {
      int count = 0;
      for (int j = 0; j < words.length; j++) {
        if (words[i].equals(words[j])) {
          count++;
        }
      }
      if (count > 1) {
        System.out.println(words[i]);
      }
    }

  }

}

