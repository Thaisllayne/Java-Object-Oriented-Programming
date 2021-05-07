
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta conta2 = new Conta();
		System.out.println(conta2.saldo);
		
		conta2.titular = new Cliente();
		System.out.println(conta2.titular);
		
		conta2.titular.nome = "João";
		System.out.println(conta2.titular.nome);
	}
}
