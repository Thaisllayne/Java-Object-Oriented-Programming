
public class ProjetoPessoas {

	public static void main(String[] args) {
		
		Visitante p1 = new Visitante();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		Bolsista b1 = new Bolsista();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("João");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p2.pagarMensalidade();
		
		b1.setMatricula(1112);
		b1.setNome("Felipe");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3.toString());
//		System.out.println(p4.toString());
	}
	
}
