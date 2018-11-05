package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name = "usuario")
public class Usuario extends BasicModel{
    
    private String login;
    private String senha;
    private List<Funcionario> funcionarios;

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    @Column(name = "senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return login;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario i = (Usuario) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
