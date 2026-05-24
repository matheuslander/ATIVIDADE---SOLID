package ISP;

public class OperadorCaixa implements GerenciadorPedidos, EnviadorNotificacao {
    // Operador usa apenas as responsabilidades necessárias
    @Override
    public void abrirPedido() {
        System.out.println("Operador: novo pedido aberto.");
    }

    @Override
    public void atualizarPedido() {
        System.out.println("Operador: pedido atualizado.");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Operador: pedido cancelado.");
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Operador enviou aviso: " + mensagem);
    }
}
