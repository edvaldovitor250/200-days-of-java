public class Day083 {

  public static void main(String[] args) {
    totalDeLetras("Hoje e dia de prova");
  }

  public static void totalDeLetras(String texto) {
    int total = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (Character.isLetter(texto.charAt(i))) {
        total++;
      }
    }
    System.out.println("Total de letras: " + total);
  }	


}

