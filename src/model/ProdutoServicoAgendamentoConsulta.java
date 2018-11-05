package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto_servico_agendamento_consulta")
public class ProdutoServicoAgendamentoConsulta extends BasicModel {
    
    private ProdutoServico produtoServico;
    private AgendamentoConsulta agendamentoConsulta;

    @ManyToOne
    @JoinColumn(name = "produto_servico")
    public ProdutoServico getProdutoServico() {
        return produtoServico;
    }
    
 
    public void setProdutoServico(ProdutoServico produtoServico) {
        this.produtoServico = produtoServico;
    }

    @ManyToOne
    @JoinColumn(name = "id_agendamento_consulta")
    public AgendamentoConsulta getAgendamentoConsulta() {
        return agendamentoConsulta;
    }

    public void setAgendamentoConsulta(AgendamentoConsulta agendamentoConsulta) {
        this.agendamentoConsulta = agendamentoConsulta;
    }
    
}
