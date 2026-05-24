package LSP;

public class Hamburguer extends Produto {
    // Hamburguer é um tipo de produto
    private boolean artesanal;

    public Hamburguer(String nome, double preco, boolean artesanal) {
        super(nome, preco);
        this.artesanal = artesanal;
    }

    @Override
    public void exibirDetalhes() {
        String tipo = artesanal ? "artesanal" : "tradicional";
        System.out.println("Hambúrguer: " + nome + " | Tipo: " + tipo + " | Preço: R$ " + preco);
    }
}
