class Conta{
	// private significa que somente a class pode ler e modificar
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		// � um construtor, ele n�o tem retorno;
		// � uma rotina de inicializa��o dos atributos;
		
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);
		
	}
	
	
	
	// tamb�m precisa declarar o par�metro
	public void deposita(double valor){
		
		// this � utilizado em atributos
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
	//  e nem sempre s�o necess�rios
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("N�o pode valor negativo ou 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor negativo ou 0");
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