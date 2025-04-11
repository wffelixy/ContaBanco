import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o Scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados formatados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                + " já está disponível para saque.");

        // Encerrando o Scanner
        scanner.close();
    }
}
