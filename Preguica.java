package ExerciciosHerança;

public class Preguica extends Animal{
	
	private String sobeArvore;

	public String getSobeArvore() {
		System.out.println("*Subindo na árvore");
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	

}
