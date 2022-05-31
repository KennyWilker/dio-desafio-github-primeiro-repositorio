public class Principal {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaCorrente();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
