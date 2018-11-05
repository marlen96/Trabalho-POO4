package model;

import java.beans.Transient;
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
@Table(name = "contas_a_pagar")
public class ContasAPagar extends BasicModel {
    
    private Date data;
    private BigDecimal valor;
    private Fornecedor fornecedor;
    private TipoDeConta tipoDeConta;

    @Temporal(TemporalType.DATE)
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    @Column(name = "valor")
    public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
	public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_de_conta")
    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    @Transient
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof ContasAPagar) {
            ContasAPagar i = (ContasAPagar) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
}
