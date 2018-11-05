package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto_servico_venda_servico")
public class ProdutoServicoVendaServico extends BasicModel {
    
    private int quantidadeProduto;
    private BigDecimal valorProduto;
    private ProdutoServico produtoServico;
    private VendaServico vendaServico;

    @Column(name = "quantidade_produto")
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Column(name = "valor_produto")
    public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

    @ManyToOne
    @JoinColumn(name = "id_produto_servico")
	public ProdutoServico getProdutoServico() {
        return produtoServico;
    }

    public void setProdutoServico(ProdutoServico produtoServico) {
        this.produtoServico = produtoServico;
    }

    @ManyToOne
    @JoinColumn(name = "id_venda_servico")
    public VendaServico getVendaServico() {
        return vendaServico;
    }

    public void setVendaServico(VendaServico vendaServico) {
        this.vendaServico = vendaServico;
    }
    
}
