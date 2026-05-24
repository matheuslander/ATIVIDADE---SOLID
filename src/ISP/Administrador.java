package ISP;

public class Administrador implements GerenciadorPedidos, GerenciadorEntregas,
        EnviadorNotificacao, GeradorRelatorio {
    // Administrador pode usar todas as responsabilidades do sistema
    @Override
    public void abrirPedido() {
        System.out.println("Administrador: pedido aberto.");
    }

    @Override
    public void atualizarPedido() {
        System.out.println("Administrador: pedido atualizado.");}

    @Override
    public void cancelarPedido() {
        System.out.println("Administrador: pedido cancelado.");
    }

    @Override
    public void iniciarEntrega() {
        System.out.println("Administrador: entrega liberada.");
    }

    @Override
    public void finalizarEntrega() {
        System.out.println("Administrador: entrega encerrada.");
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Administrador enviou notificação: " + mensagem);}

    @Override
    public void gerarRelatorio() {
        System.out.println("Administrador: relatório do delivery gerado.");
    }
}
