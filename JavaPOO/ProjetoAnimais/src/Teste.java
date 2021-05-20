
public class Teste {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Cachorro c = new Cachorro();
		Canguru canguru = new Canguru();
		
//		m.setPeso(85.3f);
//		m.setCorPelo("Marrom");
//		m.alimentar();
//		m.locomover();
//		m.emitirSom();
//		
//		a.locomover();
//		p.locomover();
//		r.locomover();
//		
//		c.enterrarOsso();
//		canguru.locomover();
//		
		c.reagir("Olá");
		c.reagir(11, 45);
		c.reagir(false);
		c.reagir(17, 4.5f);
	}
	
	
	
}
