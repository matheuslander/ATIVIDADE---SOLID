package DIP;

    // A CentralNotificacoes trabalha utilizando a interface CanalNotificacao,
    // permitindo usar diferentes tipos de envio sem alterar a classe principal

public class Main {
    public static void main(String[] args) {

        CanalNotificacao email = new NotificacaoEmail();
        CanalNotificacao sms = new NotificacaoSMS();
        CanalNotificacao whatsapp = new NotificacaoWhatsApp();

        System.out.println("--- Cliente usando Email ---");
        CentralNotificacoes centralEmail = new CentralNotificacoes(email);
        centralEmail.avisarPedidoRecebido();
        centralEmail.avisarPedidoEmPreparo();
        centralEmail.avisarPedidoSaiuEntrega();
        centralEmail.avisarPedidoEntregue();

        System.out.println("\n--- Cliente usando SMS ---");
        CentralNotificacoes centralSMS = new CentralNotificacoes(sms);
        centralSMS.avisarPedidoRecebido();
        centralSMS.avisarPedidoEmPreparo();
        centralSMS.avisarPedidoSaiuEntrega();
        centralSMS.avisarPedidoEntregue();

        System.out.println("\n--- Cliente usando WhatsApp ---");
        CentralNotificacoes centralWhats = new CentralNotificacoes(whatsapp);
        centralWhats.avisarPedidoRecebido();
        centralWhats.avisarPedidoEmPreparo();
        centralWhats.avisarPedidoSaiuEntrega();
        centralWhats.avisarPedidoEntregue();
    }
}