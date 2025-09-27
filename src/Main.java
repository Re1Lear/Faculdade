//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente Conta = new ContaCorrente(500);

        Conta.depositar(200);
        Conta.sacar(100);

        System.out.println("Saldo final: R$" + Conta.getSaldo());
    }
}