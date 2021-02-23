package lista3;

import java.util.List;
import java.util.ArrayList;

public class OrdemDeServico {
    private int codigo;
    private Cliente cliente;
    private List<Servico> servicos;
    private List<Mecanico> mecanicos;

    public OrdemDeServico(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
        this.mecanicos = new ArrayList<>();
    }

    public void adicionaServico(Servico servico){
        servicos.add(servico);
    }

    public void adicionaMecanico(Mecanico mecanico){
        mecanicos.add(mecanico);
    }

    public double calculaValorTotal(){
        double total = 0;

        for(Servico servico: servicos){
            total += servico.getValor();
        }

        return total;
    }

    public boolean possuiServico(int codigo){

        for(Servico servico: servicos){
            if(servico.getCodigo() == codigo){
                return true;
            }
        }

        return false;
    }

    public boolean possuiMecanico(String cpf){

        for(Mecanico mecanico: mecanicos){
            if(mecanico.getCpf().equals(cpf)){
                return true;
            }
        }

        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        StringBuilder valor = new StringBuilder("====== Ordem de Serviço ====== \nCódigo: " + codigo + " Cliente: " + cliente);

        valor.append("\n---- Mecânicos Responsáveis ----\n");

        for(Mecanico mecanico: mecanicos){
            valor.append(mecanico);
            valor.append("\n");
        }

        valor.append("\n---- Serviços ----\n");

        for(Servico servico: servicos){
            valor.append(servico);
            valor.append("\n");
        }

        return valor.toString();
    }
}