import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("========= CONTA BANCÁRIA =========");
		System.out.println("Digite o número da Conta:");
		numero = sc.nextInt();

		System.out.println("Digite o número da Agência:");
		agencia = sc.nextLine();

		System.out.println("Digite seu nome: ");
		nomeCliente = sc.nextLine();

		System.out.println("Digite o saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo R$%.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}
}
