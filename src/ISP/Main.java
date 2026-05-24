package ISP;

    // As interfaces foram separadas para cada classe implementar apenas o que realmente utiliza.

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Operador de Caixa ---");
        OperadorCaixa operador = new OperadorCaixa();
        operador.abrirPedido();
        operador.atualizarPedido();
        operador.cancelarPedido();
        operador.enviarNotificacao("Seu pedido foi recebido pelo restaurante.");

        System.out.println("\n--- Motoboy ---");
        Motoboy motoboy = new Motoboy();
        motoboy.iniciarEntrega();
        motoboy.finalizarEntrega();

        System.out.println("\n--- Administrador ---");
        Administrador administrador = new Administrador();

        administrador.abrirPedido();
        administrador.atualizarPedido();
        administrador.cancelarPedido();
        administrador.iniciarEntrega();
        administrador.finalizarEntrega();
        administrador.gerarRelatorio();
        administrador.enviarNotificacao("Sistema atualizado.");
    }
}
