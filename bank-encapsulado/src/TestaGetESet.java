
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1111, 452634);
		
		//conta.numero = 1337 (sem proteção e sem praticidade);
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		
	}
}
 