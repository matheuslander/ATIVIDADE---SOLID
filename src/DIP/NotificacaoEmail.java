package DIP;

public class NotificacaoEmail implements CanalNotificacao {
    // Classe responsável pelo envio de notificações por Email
    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-MAIL] " + mensagem);
    }
}
