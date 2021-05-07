
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta:" + primeiraConta.saldo);
		
		// Referência: (ambas contas estão direcionadas para o mesmo objeto)
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Novo saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Novo saldo da primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("As contas são iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
