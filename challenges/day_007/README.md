# Day 7

## Desafio:

Escreva um programa Java que inverta uma string.

**Resultado:**

```java

public class Day007 {
  public static void main(String[] args) {

  String nome = "Vitor";

  String inverter = new StringBuilder(nome).reverse().toString();
  
  System.out.println("Nome invertido: " + inverter);
    
}

}
