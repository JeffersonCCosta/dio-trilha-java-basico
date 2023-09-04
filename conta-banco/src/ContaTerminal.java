import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String numeroAgencia, nomeCliente, sobrenomeCliente;
        double saldoConta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        numeroAgencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.println("Digite o sobre nome do cliente: ");
        sobrenomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", conta: " + numeroConta +
                " e seu saldo R$" + saldoConta + " já está disponível para saque.");

    }
}
