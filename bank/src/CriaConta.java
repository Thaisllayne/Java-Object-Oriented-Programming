

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}

}
