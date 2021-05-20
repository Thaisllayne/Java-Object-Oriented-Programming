
public class Cachorro extends Mamifero {
	
	public void enterrarOsso() {
		System.out.println("Enterrrando Osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o Rabo");
	}

	public void reagir(String frase) {
		if (frase == "toma comida" || frase == "Olá") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if ( hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
	
}
