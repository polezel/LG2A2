package ex1;
import java.util.Date;
import java.time.Period;
import java.time.LocalDate;
import java.util.Calendar;




public class Pessoa {

	private String nome;
	private Date nascimento;
	private float altura;
	
	
	public Pessoa(String nome, Date nascimento, float altura){
		
		this.nome = nome;
		this.nascimento = nascimento;
		this.altura = altura;
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public void imprimir() {
		
		System.out.println(nome + " " + nascimento + " " + altura);
		
	}
	
	
	
	
}