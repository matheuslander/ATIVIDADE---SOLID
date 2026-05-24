package DIP;

public class CentralNotificacoes {
    private CanalNotificacao canal;

    // A classe recebe a interface CanalNotificacao,
    // permitindo utilizar qualquer tipo de notificação

    public CentralNotificacoes(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void avisarPedidoRecebido() {
        canal.enviar("Seu pedido foi recebido pelo delivery!");
    }

    public void avisarPedidoEmPreparo() {
        canal.enviar("Seu pedido está sendo preparado.");
    }

    public void avisarPedidoSaiuEntrega() {
        canal.enviar("Seu pedido saiu para entrega!");
    }

    public void avisarPedidoEntregue() {
        canal.enviar("Seu pedido foi entregue. Obrigado pela preferência!");
    }
}