package CalculadoraFormas;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirDetalhes() {
        System.out.println("Círculo: Raio = " + raio);
        System.out.println("Área = " + calcularArea() + ", Perímetro = " + calcularPerimetro());
    }
}
