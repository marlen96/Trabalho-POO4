package model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoas extends BasicModel {

    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;
    
    // Get

    
    @Column(name = "nome")
	public String getNome() {
		return nome;
	}
    
    @Column(name = "cpf")
	public String getCpf() {
		return cpf;
	}
    
    @Column(name = "rg")
    public String getRg() {
		return rg;
	}


	@Column(name = "telefone")
	public String getTelefone() {
		return telefone;
	}
    
    @Column(name = "email")
	public String getEmail() {
		return email;
	}
    
    @Column(name = "rua")
	public String getRua() {
		return rua;
	}
    
    @Column(name = "numero")
	public String getNumero() {
		return numero;
	}
    
    @Column(name = "bairro")
	public String getBairro() {
		return bairro;
	}
    
    @Column(name = "cidade")
	public String getCidade() {
		return cidade;
	}
    
    @Column(name = "cep")
	public String getCep() {
		return cep;
	}
	
	//Set
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
    
    
}
