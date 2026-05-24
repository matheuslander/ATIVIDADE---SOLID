package LSP;

public class Bebida extends Produto {
    // Bebida é um tipo de produto
    private boolean gelada;

    public Bebida(String nome, double preco, boolean gelada) {
        super(nome, preco);
        this.gelada = gelada;
    }

    @Override
    public void exibirDetalhes() {
        String temperatura = gelada ? "gelada" : "natural";
        System.out.println("Bebida: " + nome + " | Temperatura: " + temperatura + " | Preço: R$ " + preco);
    }
}
