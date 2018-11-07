package model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "produto_servico")
public class ProdutoServico {
    
	private Long id;
    private String nome;
    private String marca;
    private BigDecimal precoDeVenda;
    private BigDecimal precoDeCompra;
    private Calendar validade;
    private String lote;
    private Tipo tipo;
    private List<Fornecedor> fornecedor;
    private List<ProdutoServicoAgendamentoConsulta> fornecedoresServicosAgendamentosConsultas;
    private List<ProdutoServicoVendaServico> produtosServicosVendasServicos;
    
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_geral")
	@SequenceGenerator(name = "sequence_geral", sequenceName = "sequence_geral", allocationSize = 1)
	@Column(name="id_produto_servico")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
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
	public Calendar getValidade() {
        return validade;
    }

    public void setValidade(Calendar validade) {
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
    
    @OneToMany(mappedBy = "produtoServico", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ProdutoServicoAgendamentoConsulta> getFornecedoresServicosAgendamentosConsultas() {
        return fornecedoresServicosAgendamentosConsultas;
    }

    public void setFornecedoresServicosAgendamentosConsultas(List<ProdutoServicoAgendamentoConsulta> fornecedoresServicosAgendamentosConsultas) {
        this.fornecedoresServicosAgendamentosConsultas = fornecedoresServicosAgendamentosConsultas;
    }

    @OneToMany(mappedBy = "produtoServico", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ProdutoServicoVendaServico> getProdutosServicosVendasServicos() {
        return produtosServicosVendasServicos;
    }

    public void setProdutosServicosVendasServicos(List<ProdutoServicoVendaServico> produtosServicosVendasServicos) {
        this.produtosServicosVendasServicos = produtosServicosVendasServicos;
    }

    @Override
    public String toString() {
        return nome;
                }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProdutoServico) {
            ProdutoServico i = (ProdutoServico) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
