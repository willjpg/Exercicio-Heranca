package ExerciciosHerança;

public class HerancaAnimais {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cao.setNome("Bob");
		cao.setIdade(5);
		
		cavalo.setNome("Roger");
		cavalo.setIdade(7);

		preguica.setNome("Jonnathan");
		preguica.setIdade(4);

		
		
		
		System.out.println("Nome do cachorro: " +cao.getNome());
		System.out.println("Idade: "+cao.getIdade());
		cao.getEmitirSom();
		cao.getDeveCorrer();
		
		System.out.println();
		System.out.println("Nome do cavalo: " +cavalo.getNome());
		System.out.println("Idade: "+cavalo.getIdade());
		cavalo.getEmitirSom();
		cavalo.getDeveCorrer();
		
		System.out.println();
		System.out.println("Nome da preguiça: " +preguica.getNome());
		System.out.println("Idade: "+preguica.getIdade());
		preguica.getEmitirSom();
		preguica.getSobeArvore();
	}

}
