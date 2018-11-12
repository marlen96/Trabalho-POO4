package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "forma_de_pagamento")
public class FormaDePagamento extends BasicModel{
   
    private String descricao;
    private List<VendaServico> vendasServico;

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
    
}
