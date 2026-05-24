package SRP;

public class ItemPedido {
    // Entidade que representa um item do pedido
    private String descricao;
    private double valor;

    public ItemPedido(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
