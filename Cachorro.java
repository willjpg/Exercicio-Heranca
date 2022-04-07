package ExerciciosHerança;

public class Cachorro extends Animal {

	private String deveCorrer;
	
	

	public String getDeveCorrer() {
		System.out.println("*Correndo*");
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		
		this.deveCorrer = deveCorrer;
	}
	
	
	
	
}
