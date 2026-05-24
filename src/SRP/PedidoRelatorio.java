package SRP;

public class PedidoRelatorio {
    // Classe responsável apenas por exibir as informações do pedido
    public void exibir(Pedido pedido) {
        System.out.println("===== Dados do Pedido " + pedido.getNumero() + " =====");
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Produtos do pedido:");

        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getDescricao() + " | R$ " + item.getValor());
        }

        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());
    }
}
