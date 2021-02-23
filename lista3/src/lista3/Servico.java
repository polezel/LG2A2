package lista3;

public class Servico{
    private int codigo;
    private String nome;
    private double valor;

    public Servico(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "====== Servico ====== \nCódigo: " + codigo + " Nome: " + nome + " Valor: " + valor;
    }
}