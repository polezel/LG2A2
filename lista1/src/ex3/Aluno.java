package ex3;

public class Aluno {

	private String matricula, nome;
	private float prova1, prova2, trab1;
	
	public Aluno(String matricula, String nome, float prova1, float prova2, float trab1) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trab1 = trab1;
	
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getProva1() {
		return prova1;
	}


	public void setProva1(float prova1) {
		this.prova1 = prova1;
	}


	public float getProva2() {
		return prova2;
	}


	public void setProva2(float prova2) {
		this.prova2 = prova2;
	}


	public float getTrab1() {
		return trab1;
	}


	public void setTrab1(float trab1) {
		this.trab1 = trab1;
	}

	

	public float calculaMedia() {
		
		float media = (prova1 + prova2 + trab1)/3;
		
		return media;
		
	}
	
	public String situacao() {
		
		float media = calculaMedia();
		String situacao;
		
		if(media>=6) {
			situacao = "Aprovado";
		}
		else if(media>=4) {
			situacao = "IFA";
		}
		else {
			situacao = "Reprovado";
		}
		
		return situacao;
		
	}
	
}
