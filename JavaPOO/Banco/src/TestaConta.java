
public class TestaConta {
	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta(1111);
		p1.setDono("Jo�o");
		p1.abrirConta("CC");
		
		
		Conta p2 = new Conta();
		p2.setNumConta(2222);
		p2.setDono("Maria");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}

}
