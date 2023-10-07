public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaTerminal() {
    }

    public void imprimirMsg(int numero, String agencia, String nomeCliente, double saldo){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
