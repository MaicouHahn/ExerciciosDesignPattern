package SistemaCadastroProdutos;

public class Produto {

    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
