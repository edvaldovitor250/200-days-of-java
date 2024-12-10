public class Day008 {

  public static void main(String[] args) {
    
      Calculadora calculadora = new Calculadora(21, 30, '+');

      int resultado = calculadora.calcular();

      System.out.println("Resultado: " + resultado);
  }
}


class Calculadora {

  private int numero1;
  private int numero2;
  private char operacao;

  public Calculadora(int numero1, int numero2, char operacao) {
      this.numero1 = numero1;
      this.numero2 = numero2;
      this.operacao = operacao;
  }

  public int calcular() {
      return switch (operacao) {
          case '+' -> somar(numero1, numero2);
          case '-' -> subtrair(numero1, numero2);
          case '*' -> multiplicar(numero1, numero2);
          case '/' -> dividir(numero1, numero2);
          default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
      };
  }

  public int somar(int a, int b) {
      return a + b;
  }

  public int subtrair(int a, int b) {
      return a - b;
  }

  public int multiplicar(int a, int b) {
      return a * b;
  }

  public int dividir(int a, int b) {
      if (b == 0) {
          throw new ArithmeticException("Divisão por zero não é permitida.");
      }
      return a / b;
  }
}

