class ContaCorrente extends Conta {
    // Construtor padrão
    public ContaCorrente() {
        super();
    }

    // Construtor com saldo inicial
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // Sobrescrevendo método da classe pai
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        }
    }
}