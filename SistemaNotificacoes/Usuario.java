package SistemaNotificacoes;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");

        Notificacao email = new EmailNotificacao();
        Notificacao sms = new SmsNotificacao();
        Notificacao push = new PushNotificacao();

        usuario.receberNotificacao(email, "Você tem uma nova mensagem.");
        usuario.receberNotificacao(sms, "Seu código de verificação é 12345.");
        usuario.receberNotificacao(push, "Você tem uma nova notificação no aplicativo.");
    }
}