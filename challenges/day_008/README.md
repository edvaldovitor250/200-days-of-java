# Day 8

## Desafio:

Crie uma classe em Java para representar uma calculadora básica com soma, subtração, multiplicação e divisão.

**Resultado:**

```java


public class Day008 {
  
  public static void main(String[] args) {
    
    
    int numero1 = 21;
    int numero2 = 30;
  
    char operacao = '+';
  
    int resolucao = switch (operacao) {
      case '+' -> numero1 + numero2;
      case '-' -> numero1 - numero2;
      case '*' -> numero1 * numero2;
      case '/' -> numero1 / numero2;
      default -> throw new IllegalArgumentException("Operação inválida: " + operacao); 
    };
  
    System.out.println("Resultado: " + resolucao);

  }

}
