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

