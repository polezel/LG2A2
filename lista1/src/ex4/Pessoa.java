package ex4;

public class Pessoa {

	private String nome;
	private int idade;
	private Pessoa pai;
	private Pessoa mae;
	
	public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
		
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	public void imprimiArvore() {
		
		System.out.println("Nome: " + nome + " - Idade: " + idade);
		
		
		if(pai != null) {
			
			System.out.println("Pai: ");
			pai.imprimiArvore();
		}
		
		if(mae != null) {
			
			System.out.println("M�e: ");
			mae.imprimiArvore();
		}
	}
}
