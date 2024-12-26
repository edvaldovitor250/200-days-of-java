public class Day025 {

  public static void main(String[] args) {
    try {
      while (true) {
        System.out.print("Digite um número ou 'sair' para encerrar: ");
        String input = System.console().readLine();
        if (input.equals("sair")) {
          break;
        }
        int number = Integer.parseInt(input);
        System.out.println("Número digitado: " + number);
      }
    } catch (NumberFormatException e) {
      System.out.println("Erro: Digite um número válido.");
    }
  }
}

