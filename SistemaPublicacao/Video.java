package SistemaPublicacao;

class Video extends Publicacao {
    private int duracao;

    public Video(String titulo, String autor, String descricao, int duracao) {
        super(titulo, autor, descricao);
        this.duracao = duracao;
    }

    @Override
    public String exibirResumo() {
        return "Vídeo: " + titulo + " por " + autor + "\nDescrição: " + descricao + "\nDuração: " + duracao + " minutos";
    }
}