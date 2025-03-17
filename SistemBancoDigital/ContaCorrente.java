package SistemBancoDigital;

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
}
