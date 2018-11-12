package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "anamnese")
public class Anamnese extends BasicModel {
    

    private String diagnostico;
    private String anamnese;
    private String medicamentos;
    private String procedimentosRealizados;
    private FichaAnimal fichaAnimal;

    @Column(name = "diagnostico")
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Column(name = "anamnese")
    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    @Column(name = "medicamentos")
    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Column(name = "procedimentos_realizados")
    public String getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    public void setProcedimentosRealizados(String procedimentosRealizados) {
        this.procedimentosRealizados = procedimentosRealizados;
    }

    @ManyToOne
    @JoinColumn(name = "id_ficha_animal")
    public FichaAnimal getFichaAnimal() {
        return fichaAnimal;
    }

    public void setFichaAnimal(FichaAnimal fichaAnimal) {
        this.fichaAnimal = fichaAnimal;
    }
   
}
