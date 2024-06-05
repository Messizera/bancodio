public class main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("lucas");



        Conta cc = new ContaCorrente(lucas);
        cc.depositar(100);
        
        Conta poupanca = new ContaPoupança(lucas);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
