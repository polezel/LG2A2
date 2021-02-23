package lista3;


public class Cliente extends Pessoa {			//herda atributos e m�todos da classe pessoa

	private String telefone;

	public Cliente(String cpf, String nome, String telefone) {
		
		super (cpf, nome);
		this.telefone = telefone;
		
	}



	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Cliente [Telefone: " + telefone + "]";
	}
	
}