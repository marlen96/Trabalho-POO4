package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoas{
    
    private String tituloDeEleitor;
    private String pis;
    private String funcao;
    private EstadoCivilEnum estadoCivil;
    private Usuario usuarios;
    private List<VendaServico> vendasServicos;


	@Enumerated(EnumType.ORDINAL)
	@Column(name ="estado_civil")
	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "titulo_de_eleitor")
    public String getTituloDeEleitor() {
        return tituloDeEleitor;
    }

    public void setTituloDeEleitor(String tituloDeEleitor) {
        this.tituloDeEleitor = tituloDeEleitor;
    }

    @Column(name = "pis")
    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Column(name = "funcao")
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<VendaServico> getVendasServicos() {
        return vendasServicos;
    }

    public void setVendasServicos(List<VendaServico> vendasServicos) {
        this.vendasServicos = vendasServicos;
    }
    
}
