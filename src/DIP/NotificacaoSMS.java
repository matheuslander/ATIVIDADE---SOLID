package DIP;

public class NotificacaoSMS implements CanalNotificacao {
    // Classe responsável pelo envio de notificações por SMS
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
