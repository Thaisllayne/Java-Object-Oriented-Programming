
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 23313);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12454);
		
		Conta conta2 = new Conta(1337, 222222);
		Conta conta3 = new Conta(2121, 544255);
		
		System.out.println(Conta.getTotal());
	}

}
