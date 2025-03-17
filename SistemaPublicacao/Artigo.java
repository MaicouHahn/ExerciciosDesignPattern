package SistemaPublicacao;

class Artigo extends Publicacao {
    private int numeroDePalavras;

    public Artigo(String titulo, String autor, String descricao, int numeroDePalavras) {
        super(titulo, autor, descricao);
        this.numeroDePalavras = numeroDePalavras;
    }

    @Override
    public String exibirResumo() {
        return "Artigo: " + titulo + " por " + autor + "\nDescrição: " + descricao + "\nPalavras: " + numeroDePalavras;
    }
}
