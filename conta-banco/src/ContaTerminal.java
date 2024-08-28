import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta");
        int conta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + "! \nobrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta);
        System.out.println("e seu saldo " + saldo + " já está disponível para saque");
    }
}
