# Day 16

## Desafio:

		Crie uma classe em Java para representar um sistema de gerenciamento de estoque com operações de adicionar, remover e atualizar itens.

**Resultado:**

```java

import java.util.HashMap;
import java.util.Map;

public class Day016 {

    public static void main(String[] args) {
        SistemaEstoque sistema = new SistemaEstoque();
        sistema.Adicionar("Carro", 20);
        sistema.Adicionar("Lapiz", 20);
        sistema.Adicionar("Notebook", 15);
        sistema.Remover("Lapiz", 5);
        sistema.Listar();
    }
}

class SistemaEstoque {
    private Map<String, Integer> estoque;

    public SistemaEstoque() {
        this.estoque = new HashMap<>();
    }

    public void Adicionar(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            estoque.put(nome, estoque.get(nome) + quantidade);
        } else {
            estoque.put(nome, quantidade);
        }
        System.out.println("Item " + nome + " adicionado. Quantidade atual: " + estoque.get(nome));
    }

    public void Remover(String nome, int quantidade) {
        if (!estoque.containsKey(nome)) {
            System.out.println("Item " + nome + " não encontrado no estoque.");
            return;
        }
        int quantidadeAtual = estoque.get(nome);
        if (quantidade > quantidadeAtual) {
            System.out.println("Quantidade insuficiente para remover o item " + nome);
        } else {
            estoque.put(nome, quantidadeAtual - quantidade);
            System.out.println("Item " + nome + " removido. Quantidade atual: " + estoque.get(nome));
        }
        if (estoque.get(nome) == 0) {
            estoque.remove(nome);
        }
    }

    public void Listar() {
        System.out.println("Estoque atual:");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }
}
