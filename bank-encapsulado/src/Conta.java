class Conta{
	// private significa que somente a class pode ler e modificar
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		// é um construtor, ele não tem retorno;
		// é uma rotina de inicialização dos atributos;
		
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	
	
	// também precisa declarar o parâmetro
	public void deposita(double valor){
		
		// this é utilizado em atributos
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
	
	// get: pega algum valor;
	// set: modifica algo;
	//  e nem sempre são necessários
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Não pode valor negativo ou 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor negativo ou 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}