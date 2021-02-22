package lista2;
import java.math.*;
import java.util.List;
import java.util.ArrayList;


public class Conta {

	private String nome;
	private BigDecimal saldo;
	private List<Orcamento> orcamentos;
	
	
	public Conta(String nome) {
		
		this.nome = nome;
		saldo = new BigDecimal("0.00");
		orcamentos = new ArrayList<>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	
	public void adicionaOrcamento(Orcamento orc) {		//m�todo que adiciona um orc�amento a lista da conta e atualiza o saldo atual
		
		orcamentos.add(orc);							//adiciona o or�amento orc a lista de or�amentos da conta
		
		if(orc.getTipo() == TipoTransacao.RECEITA) {	//verifica o tipo do or�amento
			saldo = saldo.add(orc.getValor());
		}
		else {
			saldo = saldo.subtract(orc.getValor());
		}
			
	}

	public void imprimiConta() { //realiza a impressao do nome do titular da conta, saldo atual e de todas as opera�oes realziadas
		
		System.out.println("Nome: " + nome + " - Saldo: " + saldo);
		System.out.println("Or�amentos: ");	
		
		for(Orcamento orc: orcamentos) {
			System.out.println(orc);
			
		}
		
	}

}
