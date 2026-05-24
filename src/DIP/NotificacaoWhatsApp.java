package DIP;

public class NotificacaoWhatsApp implements CanalNotificacao {
    // Classe responsável pelo envio de notificações por WhatsApp
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WHATSAPP] " + mensagem);
    }
}
