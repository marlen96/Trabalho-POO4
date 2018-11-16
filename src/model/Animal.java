package model;


import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "animal")
public class Animal extends BasicModel{
    
    private String nome;
    private String raca;
    private String pesoOuPorte;
    private Calendar dataNascimento;
    private String especie;
    private String sexo;
    private Cliente cliente;
    private List<FichaAnimal> fichasAnimais;


    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name = "raca")
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Column(name = "peso_ou_porte")
    public String getPesoOuPorte() {
        return pesoOuPorte;
    }

    public void setPesoOuPorte(String pesoOuPorte) {
        this.pesoOuPorte = pesoOuPorte;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Column(name = "especie")
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Column(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<FichaAnimal> getFichasAnimais() {
        return fichasAnimais;
    }
    
    public void setFichasAnimais(List<FichaAnimal> fichasAnimais) {
        this.fichasAnimais = fichasAnimais;
    }


}
