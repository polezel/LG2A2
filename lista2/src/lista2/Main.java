package lista2;
import java.time.LocalDate;
import java.math.*;


public class Main {

	public static void main(String[] args) {

		Conta c1 = new Conta ("Lucas");
		
		
		LocalDate dia1 = LocalDate.now(); 									//recebe a data atual do sistema
		BigDecimal valor1 = new BigDecimal("5200.00");						//valor da transa��o
		String descricao1 = "Sal�rio";										//descreve a transa��o
		TipoTransacao tipo1 = TipoTransacao.RECEITA; 						//indentifica o tipo de transa��o
		
		Orcamento o1 = new Orcamento(dia1, valor1, descricao1, tipo1);		//cria um or�amento
		c1.adicionaOrcamento(o1);											//adiciona na conta
		
		
		
		LocalDate dia2 = LocalDate.now();
		BigDecimal valor2 = new BigDecimal("800.00");
		String descricao2 = "Jogo do Bicho";
		TipoTransacao tipo2 = TipoTransacao.RECEITA;
		
		Orcamento o2 = new Orcamento(dia2, valor2, descricao2, tipo2);
		c1.adicionaOrcamento(o2);
		
		
		
		LocalDate dia3 = LocalDate.now();
		BigDecimal valor3 = new BigDecimal("5600.00");
		String descricao3 = "Compra PC";
		TipoTransacao tipo3 = TipoTransacao.DESPESA;
		
		Orcamento o3 = new Orcamento(dia3, valor3, descricao3, tipo3);
		c1.adicionaOrcamento(o3);	
		

		c1.imprimiConta();													//realiza a impress�o	
		

	}

}
