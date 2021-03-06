class Conta{
	// private significa que somente a class pode ler e modificar
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	// tamb?m precisa declarar o par?metro
	public void deposita(double valor){
		
		// this ? utilizado em atributos
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}