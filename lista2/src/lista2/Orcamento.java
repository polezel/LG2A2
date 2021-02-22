package lista2;
import java.time.LocalDate;
import java.math.*;

public class Orcamento {

	private LocalDate data;
	private BigDecimal valor;
	private String descricao;
	private TipoTransacao tipo;
	
	public Orcamento(LocalDate data, BigDecimal valor, String descricao, TipoTransacao tipo) {
		
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
		this.tipo = tipo;
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {

		this.tipo = tipo;
	}


	
	public String toString() {
		return "Orcamento [data=" + data + ", valor=" + valor + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	}
	
	
}
