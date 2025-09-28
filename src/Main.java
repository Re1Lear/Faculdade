public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(500);

        conta.depositar(200);
        conta.sacar(100);

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
