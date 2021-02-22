package ex4;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa avohMaterna = new Pessoa("Silvia", 74, null, null);
		Pessoa avoMaterno = new Pessoa("Gilberto", 76, null, null);
		Pessoa avohPaterna = new Pessoa("Hilda", 84, null, null);
		Pessoa avoPaterno = new Pessoa("Hermínio", 86, null, null);
		Pessoa pai = new Pessoa("Claudio", 53, avoPaterno, avohPaterna);
		Pessoa mae = new Pessoa("Valéria", 49, avoMaterno, avohMaterna);
		Pessoa eu = new Pessoa("Lucas", 21, pai, mae);
		
		eu.imprimiArvore();
	}

}
