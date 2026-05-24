package SRP;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cada classe tem somente uma responsabilidade dentro do sistema
        List<ItemPedido> itens = Arrays.asList(
                new ItemPedido("Pizza de frango com catupiry", 48.90),
                new ItemPedido("Refrigerante lata", 6.50),
                new ItemPedido("Batata frita média", 18.00)
        );

        Pedido pedido = new Pedido(10, "Matheus Lander", itens);

        PedidoRepository repository = new PedidoRepository();
        PedidoRelatorio relatorio = new PedidoRelatorio();

        repository.salvar(pedido);
        relatorio.exibir(pedido);
    }
}

    // O pedido guarda os dados, o repository salva e o relatório exibe as informações.
