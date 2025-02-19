public class Day082 {

  public static void main(String[] args) {
    tresMaioresNumeros(10);
  }

  public static void tresMaioresNumeros(int n) {
    int[] numeros = new int[n];
    for (int i = 0; i < n; i++) {
      numeros[i] = (int) (Math.random() * 100);
    }

    int[] maiores = new int[3];
    for (int i = 0; i < n; i++) {
      if (numeros[i] > maiores[0]) {
        maiores[2] = maiores[1];
        maiores[1] = maiores[0];
        maiores[0] = numeros[i];
      } else if (numeros[i] > maiores[1]) {
        maiores[2] = maiores[1];
        maiores[1] = numeros[i];
      } else if (numeros[i] > maiores[2]) {
        maiores[2] = numeros[i];
      }
    }

    System.out.println("Os 3 maiores números são:");
    for (int i = 0; i < 3; i++) {
      System.out.println(maiores[i]);
    }
  }

}

