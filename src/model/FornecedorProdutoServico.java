package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor_produto_servico")
public class FornecedorProdutoServico extends BasicModel{

    private Fornecedor fornecedor;
    private ProdutoServico produtoServico;

    @ManyToOne
    @JoinColumn(name = "fornecedor")
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @ManyToOne
    @JoinColumn(name = "produto_servico")
    public ProdutoServico getProdutoServico() {
        return produtoServico;
    }

    public void setProdutoServico(ProdutoServico produtoServico) {
        this.produtoServico = produtoServico;
    }

}
