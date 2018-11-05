package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venda_servico_forma_de_pagamento")
public class VendaServicoFormaDePagamento extends BasicModel {
    
    private VendaServico vendaServico;
    private FormaDePagamento formaDePagamento;

    @ManyToOne
    @JoinColumn(name = "id_venda_servico")
    public VendaServico getVendaServico() {
        return vendaServico;
    }

    public void setVendaServico(VendaServico vendaServico) {
        this.vendaServico = vendaServico;
    }

    @ManyToOne
    @JoinColumn(name = "id_forma_de_pagamento")
    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    
}
