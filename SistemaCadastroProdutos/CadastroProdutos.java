package SistemaCadastroProdutos;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {
    private List<Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, quantidade));
    }

    public void atualizarPrecoProduto(String nome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.nome.equals(nome)) {
                produto.atualizarPreco(novoPreco);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void exibirRelatorio() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto("Produto A", 100.0, 10);
        cadastro.adicionarProduto("Produto B", 200.0, 5);
        cadastro.exibirRelatorio();
        cadastro.atualizarPrecoProduto("Produto A", 120.0);
        cadastro.exibirRelatorio();
    }
}