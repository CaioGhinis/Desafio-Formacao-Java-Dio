import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Conta!");
        int num = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String ag = sc.next();

        System.out.println("Digite o nome do Cliente!");
        String nome = sc.next();

        System.out.println("Qual o saldo do cliente?");
        double sd = sc.nextDouble();

        ContaTerminal ct = new ContaTerminal();

        ct.imprimirMsg(num, ag, nome, sd);

    }
}