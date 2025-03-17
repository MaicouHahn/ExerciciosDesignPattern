package SistemaPublicacao;

public class SistemaPublicacao {
    public static void main(String[] args) {
        Artigo artigo = new Artigo("Java Generics", "Carlos Silva", "Um artigo sobre Generics em Java", 1200);
        Video video = new Video("Introdução ao Spring Boot", "Ana Souza", "Um vídeo sobre Spring Boot", 45);
        
        System.out.println(artigo.exibirResumo());
        System.out.println("\n------------------\n");
        System.out.println(video.exibirResumo());
    }
}
