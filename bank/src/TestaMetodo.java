
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.saldo = 100;
		conta1.deposita(50);
		
		System.out.println(conta1.saldo);
		
		boolean conseguiuRetirar = conta1.saca(100);
		System.out.println(conta1.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		boolean sucessoTransferencia = conta2.transfere(300, conta1);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		conta1.titular = "Maria";
		System.out.println(conta1.titular);
		
	}

}
