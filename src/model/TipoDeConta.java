package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "tipo_de_conta")
public class TipoDeConta extends BasicModel {
    
    private String descricao;
    private List<ContasAPagar> contasAPagar;

    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @OneToMany(mappedBy = "tipoDeConta", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ContasAPagar> getContasAPagar() {
        return contasAPagar;
    }

    public void setContasAPagar(List<ContasAPagar> contasAPagar) {
        this.contasAPagar = contasAPagar;
    }
    
}
