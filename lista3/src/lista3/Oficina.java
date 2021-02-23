package lista3;


import java.util.List;
import java.util.ArrayList;

public class Oficina {
    private List<OrdemDeServico> ordensServicos;

    public Oficina(){
        ordensServicos = new ArrayList<>();
    }

    public void adicionaOS(OrdemDeServico os){
        ordensServicos.add(os);
    }

    public OrdemDeServico buscaOSCodigo(int codigo){

        for(OrdemDeServico os: ordensServicos){
            if(os.getCodigo() == codigo){
                return os;
            }
        }

        return null;
    }

    public List<OrdemDeServico> buscaOSServico(int codigo){
        List<OrdemDeServico> lista = new ArrayList<>();

        for(OrdemDeServico os: ordensServicos){
            if(os.possuiServico(codigo)){
                lista.add(os);
            }
        }

        return lista;
    }

    public List<OrdemDeServico> buscasOSCPF(String cpf){
        List<OrdemDeServico> lista = new ArrayList<>();

        for(OrdemDeServico os: ordensServicos){
            if(os.possuiMecanico(cpf)){
                lista.add(os);
            }
        }

        return lista;
    }

    public double calculaFaturamentoTotal(){
        double faturamento = 0;

        for(OrdemDeServico os: ordensServicos){
            faturamento += os.calculaValorTotal();
        }

        return faturamento;
    }

    @Override
    public String toString(){
        StringBuilder valor = new StringBuilder();

        for(OrdemDeServico os: ordensServicos){
            valor.append(os);
        }

        return valor.toString();
    }


}