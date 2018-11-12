package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "ficha_animal")
public class FichaAnimal extends BasicModel{
    
    private String pesoOuPorteAntesDoProcedimento;
    private Animal animal;
    private List<Anamnese> anamneses;
    private List<Vacina> vacinas;


    @Column(name = "peso_porte_antes_procedimento")
    public String getPesoOuPorteAntesDoProcedimento() {
        return pesoOuPorteAntesDoProcedimento;
    }

    public void setPesoOuPorteAntesDoProcedimento(String pesoOuPorteAntesDoProcedimento) {
        this.pesoOuPorteAntesDoProcedimento = pesoOuPorteAntesDoProcedimento;
    }

    @ManyToOne
    @JoinColumn(name = "id_animal")
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    @OneToMany(mappedBy = "fichaAnimal", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<Anamnese> getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(List<Anamnese> anamneses) {
        this.anamneses = anamneses;
    }

    @OneToMany(mappedBy = "fichaAnimal", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
    
}
