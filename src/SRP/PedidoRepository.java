package SRP;

public class PedidoRepository {
    // Classe responsável apenas por salvar o pedido
    public void salvar(Pedido pedido) {
        System.out.println("Pedido número " + pedido.getNumero() + " salvo no sistema!");
    }
}
