# Day 24

## Desafio:

	Crie um método em Java para calcular a potência de um número usando um loop for.

**Resultado:**

```java


public class Day024 {

  public static void main(String[] args) {
    Day024 dia = new Day024();
    
    dia.calcularPontencia(3);
  }

public void calcularPontencia(int numero){
  int potencia = 1;
  for(int i = 0; i < numero; i++){
    potencia *= 2;
  }
  System.out.println("A potência é: " + potencia);

}
 
}

