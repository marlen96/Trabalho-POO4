package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "tipo_de_vacina")
public class TipoDeVacina extends BasicModel {
    

    private String descricao;
    private List<Vacina> vacinas;

    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @OneToMany(mappedBy = "tipoDeVacina", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof TipoDeVacina) {
            TipoDeVacina i = (TipoDeVacina) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
