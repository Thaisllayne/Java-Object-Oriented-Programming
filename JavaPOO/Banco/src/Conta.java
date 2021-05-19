
public class Conta {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public Conta() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.saldo = 150;
		}	
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em d�bito");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}	
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Dep�sito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Imposs�vel depositar em uma conta fechada");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo Insuficiente para saque");
			}
		} else {
			System.out.println("Imposs�vel sacar de uma conta fechada");
		}
	}
	
	public void pagarMensal() {
		int valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Imposs�vel pagar uma conta fechada");
		}
		
	}	
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

}
