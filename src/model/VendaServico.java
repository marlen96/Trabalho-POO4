package model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "venda_servico")
public class VendaServico extends BasicModel{
	
    private BigDecimal valorTotal;
    private String descricao;
    private Calendar dataServico;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ProdutoServicoVendaServico> produtosServicosVendasServicos;
    private List<FormaDePagamento> formasdepagamentos;

	@Column(name = "valor_total")
    public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Column(name = "descricao")
	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_servico")
    public Calendar getDataServico() {
        return dataServico;
    }

    public void setDataServico(Calendar dataServico) {
        this.dataServico = dataServico;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @OneToMany(mappedBy = "vendaServico", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
	public List<ProdutoServicoVendaServico> getProdutosServicosVendasServicos() {
		return produtosServicosVendasServicos;
	}

	public void setProdutosServicosVendasServicos(List<ProdutoServicoVendaServico> produtosServicosVendasServicos) {
		this.produtosServicosVendasServicos = produtosServicosVendasServicos;
	}
    
    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "venda_servico_forma_de_pagamento", joinColumns = { @JoinColumn(name = "id_venda_servico") }, inverseJoinColumns = { @JoinColumn(name = "id_forma_de_pagamento") })
    public List<FormaDePagamento> getFormasdepagamentos() {
		return formasdepagamentos;
	}

	public void setFormasdepagamentos(List<FormaDePagamento> formasdepagamentos) {
		this.formasdepagamentos = formasdepagamentos;
	}

	@Override
    public String toString() {
        return descricao;
                }

	@Override
    public boolean equals(Object obj) {
        if (obj instanceof VendaServico) {
            VendaServico i = (VendaServico) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
