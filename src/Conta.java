abstract class Conta {
    private double saldo;

    // Construtor padrão
    public Conta() {
        this.saldo = 0.0;
    }

    // Construtor com parâmetro
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter e Setter (encapsulamento)
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método void
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    // Método abstrato (obrigatório para filhos)
    public abstract void sacar(double valor);
}
