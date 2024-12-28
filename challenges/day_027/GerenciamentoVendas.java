public class GerenciamentoVendas {

    int totalVendas;
    int totalProdutos;

    public GerenciamentoVendas(int totalVendas, int totalProdutos) {
        this.totalVendas = totalVendas;
        this.totalProdutos = totalProdutos;
    }

    public void adicionarVenda(int quantidade) {
        this.totalVendas += quantidade;
        System.out.println("Venda adicionada com sucesso!");
    }

    public void removerVenda(int quantidade) {
        if (this.totalVendas - quantidade < 0) {
            System.out.println("Não é possível remover essa quantidade de vendas.");
            return;
        }
        this.totalVendas -= quantidade;
        System.out.println("Venda removida com sucesso!");
    }

    public void listarVendas() {
        System.out.println("Total de vendas: " + this.totalVendas);
    }


}
