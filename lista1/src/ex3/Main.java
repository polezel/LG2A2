package ex3;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("SP305411X", "Chonps", 4.0f, 4.1f, 2.1f);
		System.out.println(a1.calculaMedia());
		System.out.println(a1.situacao());
		
		Aluno a2 = new Aluno("SP305412Y", "Marcelin", 8.0f, 9.1f, 4.1f);
		System.out.println(a2.calculaMedia());
		System.out.println(a2.situacao());
		
		Aluno a3 = new Aluno("SP305410X", "Pops", 5.0f, 6.1f, 5.1f);
		System.out.println(a3.calculaMedia());
		System.out.println(a3.situacao());
		
	}
		
}
