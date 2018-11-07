package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "forma_de_pagamento")
public class FormaDePagamento{
   
	private Long id;
    private String descricao;
    private List<VendaServico> vendasServico;

    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_geral")
	@SequenceGenerator(name = "sequence_geral", sequenceName = "sequence_geral", allocationSize = 1)
	@Column(name="id_forma_de_pagamento")
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @ManyToMany(mappedBy="formasdepagamentos", cascade=CascadeType.ALL)
    public List<VendaServico> getVendasServico() {
		return vendasServico;
	}

	public void setVendasServico(List<VendaServico> vendasServico) {
		this.vendasServico = vendasServico;
	}

	@Override
    public String toString() {
        return descricao;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof FormaDePagamento) {
            FormaDePagamento i = (FormaDePagamento) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
