package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "tipo")
public class Tipo extends BasicModel {
    

    private String descricao;
    private List<ProdutoServico> produtosServicos;

    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ProdutoServico> getProdutosServicos() {
        return produtosServicos;
    }

    public void setProdutosServicos(List<ProdutoServico> produtosServicos) {
        this.produtosServicos = produtosServicos;
    }
    
}
