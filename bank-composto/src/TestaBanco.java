
public class TestaBanco {
	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.nome = "Maria Santos";
		maria.cpf= "000.000.000-00";
		maria.profissao = "programador";
		
		Conta conta1 = new Conta();
		conta1.deposita(100);
		
		//associa a cliente maria a conta1
		conta1.titular = maria;
		System.out.println(conta1.titular.nome);
	}
}
