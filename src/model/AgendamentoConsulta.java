package model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agendamento_consulta")
public class AgendamentoConsulta extends BasicModel {
    
    private Calendar dataDeAgendamento;
    private String descricao;
    private String status;
    private Cliente cliente;
    private List<ProdutoServico> produtoServico;

    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "agendamento_consulta_produto_servico", joinColumns = { @JoinColumn(name = "id_agendamento_consulta") }, inverseJoinColumns = { @JoinColumn(name = "id_produto_servico") })
    public List<ProdutoServico> getProdutoServico() {
		return produtoServico;
	}

	public void setProdutoServico(List<ProdutoServico> produtoServico) {
		this.produtoServico = produtoServico;
	}

	@Temporal(TemporalType.DATE)
    @Column(name = "data_de_agendamento")
    public Calendar getDataDeAgendamento() {
        return dataDeAgendamento;
    }
    
    public void setDataDeAgendamento(Calendar dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }
    
    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
}
