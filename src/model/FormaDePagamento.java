package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "forma_de_pagamento")
public class FormaDePagamento extends BasicModel {
   
    private String descricao;
    private List<VendaServicoFormaDePagamento> vendasServicosFormasDePagamentos;

    @Column(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @OneToMany(mappedBy = "formaDePagamento", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<VendaServicoFormaDePagamento> getVendasServicosFormasDePagamentos() {
        return vendasServicosFormasDePagamentos;
    }

    public void setVendasServicosFormasDePagamentos(List<VendaServicoFormaDePagamento> vendasServicosFormasDePagamentos) {
        this.vendasServicosFormasDePagamentos = vendasServicosFormasDePagamentos;
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
