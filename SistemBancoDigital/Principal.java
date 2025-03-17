package SistemBancoDigital;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1234", 500, 200);
        ContaPoupanca cp = new ContaPoupanca("5678", 1000, 1.5);

        cc.depositar(300);
        cc.sacar(900);
        cc.sacar(100);

        cp.depositar(500);
        cp.sacar(200);
        cp.aplicarJuros();
    }
}