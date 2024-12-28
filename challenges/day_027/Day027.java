public class Day027 {

  public static void main(String[] args) {
    GerenciamentoVendas gerenciamento = new GerenciamentoVendas(0, 0);

    gerenciamento.adicionarVenda(10);
    gerenciamento.adicionarVenda(5);
    gerenciamento.removerVenda(3);
    gerenciamento.listarVendas();
  }

}

