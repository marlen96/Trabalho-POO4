package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "produto_servico")
public class ProdutoServico extends BasicModel {
    
    private String nome;
    private String marca;
    private BigDecimal precoDeVenda;
    private BigDecimal precoDeCompra;
    private Date validade;
    private String lote;
    private Tipo tipo;
    private List<Fornecedor> fornecedor;
    private List<AgendamentoConsulta> agendamentoConsulta;
    private List<ProdutoServicoVendaServico> produtosServicosVendasServicos;
    
	
	@ManyToMany(mappedBy="produtoServico", cascade=CascadeType.ALL)
	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name = "marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name = "preco_de_venda")
    public BigDecimal getPrecoDeVenda() {
		return precoDeVenda;
	}

    @Column(name = "preco_de_compra")
	public BigDecimal getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeVenda(BigDecimal precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public void setPrecoDeCompra(BigDecimal precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}

	@Temporal(TemporalType.DATE)
    @Column(name = "validade")
	public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    @Column(name = "lote")
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    @ManyToMany(mappedBy="produtoServico", cascade=CascadeType.ALL)
    public List<AgendamentoConsulta> getAgendamentoConsulta() {
		return agendamentoConsulta;
	}

	public void setAgendamentoConsulta(List<AgendamentoConsulta> agendamentoConsulta) {
		this.agendamentoConsulta = agendamentoConsulta;
	}

	@OneToMany(mappedBy = "produtoServico", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ProdutoServicoVendaServico> getProdutosServicosVendasServicos() {
        return produtosServicosVendasServicos;
    }

    public void setProdutosServicosVendasServicos(List<ProdutoServicoVendaServico> produtosServicosVendasServicos) {
        this.produtosServicosVendasServicos = produtosServicosVendasServicos;
    }
    
}
