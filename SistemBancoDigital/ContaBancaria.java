package SistemBancoDigital;

abstract class ContaBancaria {
    protected String numero;
    protected double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public abstract boolean sacar(double valor);
}