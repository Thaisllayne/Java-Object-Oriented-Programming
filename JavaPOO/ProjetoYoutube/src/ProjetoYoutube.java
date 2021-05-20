
public class ProjetoYoutube {
	
	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Inscrito i[] = new Inscrito[2];
		
		i[0] = new Inscrito("Maria", 32, "F", "Mari");
		i[1] = new Inscrito("João", 45, "M", "Joãozinho");
		
//		System.out.println(v[0].toString());
//		System.out.println(i[0].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(i[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(i[0], v[1]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
	}
}
