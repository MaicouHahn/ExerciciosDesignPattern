package CalculadoraFormas;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        retangulo.exibirDetalhes();
        
        Circulo circulo = new Circulo(7);
        circulo.exibirDetalhes();
    }
}
