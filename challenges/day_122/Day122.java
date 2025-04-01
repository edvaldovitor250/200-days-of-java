public class Day122 {

  public static void main(String[] args) {
    System.out.println("Exercicio 1: ");
    System.out.println("Soma dos números de 1 a 100: " + somaNumeros(1, 100));
    System.out.println("Soma dos números de 1 a 1000: " + somaNumeros(1, 1000));
    System.out.println("Soma dos números de 1 a 10000: " + somaNumeros(1, 10000));

    System.out.println("\nExercicio 2: ");
    List<Integer> lista = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      lista.add(i * 10);
    }
    ordernacaoLista(lista);
  }
  
  public static void ordernacaoLista(List<Integer> lista) {
    Collections.sort(lista);
    System.out.println("Lista crescente: " + lista);

    Collections.sort(lista, Collections.reverseOrder());
    System.out.println("Lista decrescente: " + lista);
  }

  
}
