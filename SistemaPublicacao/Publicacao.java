package SistemaPublicacao;

abstract class Publicacao {
    protected String titulo;
    protected String autor;
    protected String descricao;

    public Publicacao(String titulo, String autor, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
    }

    public abstract String exibirResumo();
}
