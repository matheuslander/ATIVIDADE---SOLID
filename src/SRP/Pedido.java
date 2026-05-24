package SRP;

import java.util.List;

public class Pedido {
    // Classe responsável apenas por representar os dados do pedido
    private int numero;
    private String nomeCliente;
    private List<ItemPedido> itens;

    public Pedido(int numero, String nomeCliente, List<ItemPedido> itens) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getValor();
        }
        return total;
    }
}
