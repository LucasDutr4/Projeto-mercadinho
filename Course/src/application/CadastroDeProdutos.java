package application;

public class CadastroDeProdutos {

	private Produto[] produtos;
    private int indice;

    public CadastroDeProdutos(int capacidade) {
        produtos = new Produto[capacidade];
        indice = 0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidadeEmEstoque) {
        if (indice < produtos.length) {
            Produto produto = new Produto(nome, preco, quantidadeEmEstoque);
            produtos[indice] = produto;
            indice++;
        } else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais produtos.");
        }
    }

    public void exibirProdutos() {
        for (int i = 0; i < indice; i++) {
            Produto produto = produtos[i];
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println("Valor total: R$ " + produto.calcularValorTotal());
            System.out.println("-----------------------------");
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += produtos[i].calcularValorTotal();
        }
        return total;
    }
	
}
