public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public void exibirArea() {
        System.out.println("A área do retângulo é: " + calcularArea());
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        retangulo.exibirArea();
    }
}