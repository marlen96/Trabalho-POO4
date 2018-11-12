package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoas{
    

    private List<AgendamentoConsulta> consultas;
    private List<Animal> animais;
    private List<VendaServico> vendasServico;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<AgendamentoConsulta> getConsultas() {
        return consultas;
    }

 
    public void setConsultas(List<AgendamentoConsulta> consultas) {
        this.consultas = consultas;
    }

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<VendaServico> getVendasServico() {
        return vendasServico;
    }

    public void setVendasServico(List<VendaServico> vendasServico) {
        this.vendasServico = vendasServico;
    }

}
