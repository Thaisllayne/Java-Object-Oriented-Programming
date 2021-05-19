
public class TestaLutador {
	
	public static void main(String[] args) {
		
		//declarando um vetor:
		Lutador L[] = new Lutador[6];
		
		L[0] = new Lutador("Pretty Boy", "França", 31, 
				1.75f, 68.9f, 11, 3, 1);
		
		L[1] = new Lutador("Putscript", "Brasil", 29,
				1.68f, 57.8f, 14, 2, 3);
		
		L[2] = new Lutador("Snapshadow", "EUA", 35,
				1.65f, 80.9f, 12, 2, 1);
		
		L[3] = new Lutador("Dead Code", "Austrália", 28,
				1.93f, 81.6f, 13, 0, 2);
		
		L[4] = new Lutador("Batman", "Rússia", 40,
				1.77f, 79.9f, 10, 1, 1);
		
		L[5] = new Lutador("Coringa", "Canadá", 50,
				1.83f, 105.6f, 15, 0, 1);
		
		Luta Luta1 = new Luta();
		Luta1.marcarLuta(L[0], L[1]);
		Luta1.lutar();
		L[0].status();
		L[1].status();
		
	}
	

}
