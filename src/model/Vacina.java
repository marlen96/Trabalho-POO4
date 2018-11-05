package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vacina")
public class Vacina extends BasicModel {
    
    private String marca;
    private String lote;
    private String fornecedor;
    private Date validade;
    private BigDecimal custo;
    private FichaAnimal fichaAnimal;
    private TipoDeVacina tipoDeVacina;

    @Column(name = "marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Column(name = "lote")
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    @Column(name = "fornecedor")
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "validade")
    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Column(name = "custo")
    public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	@ManyToOne
    @JoinColumn(name = "id_ficha_animal")
	public FichaAnimal getFichaAnimal() {
        return fichaAnimal;
    }

    public void setFichaAnimal(FichaAnimal fichaAnimal) {
        this.fichaAnimal = fichaAnimal;
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_de_vacina")
    public TipoDeVacina getTipoDeVacina() {
        return tipoDeVacina;
    }

    public void setTipoDeVacina(TipoDeVacina tipoDeVacina) {
        this.tipoDeVacina = tipoDeVacina;
    }

    @Override
    public String toString() {
        return marca;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vacina) {
            Vacina i = (Vacina) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
