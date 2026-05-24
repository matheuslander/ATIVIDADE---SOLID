package LSP;

public class Pizza extends Produto {
    // Pizza é um tipo de produto
    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pizza: " + nome + " | Tamanho: " + tamanho + " | Preço: R$ " + preco);
    }
}
