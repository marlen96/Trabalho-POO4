package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "fornecedor")
public class Fornecedor{
    
	private Long id;
    private String nomeFantasia;
    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;
    private List<ContasAPagar> contasAPagar;
    private List<ProdutoServico> produtoServico;
    
   
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_geral")
	@SequenceGenerator(name = "sequence_geral", sequenceName = "sequence_geral", allocationSize = 1)
	@Column(name="id_fornecedor")
    public Long getId() {
    	return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nome_fantasia")
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    @Column(name = "cnpj")
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Column(name = "razao_social")
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Column(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Column(name = "rua")
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "cidade")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Column(name = "cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    public List<ContasAPagar> getContasAPagar() {
        return contasAPagar;
    }

    public void setContasAPagar(List<ContasAPagar> contasAPagar) {
        this.contasAPagar = contasAPagar;
    }

    @ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "fornecedor_produto_servico", joinColumns = { @JoinColumn(name = "id_produto_servico") }, inverseJoinColumns = { @JoinColumn(name = "id_fornecedor") })
	public List<ProdutoServico> getProdutoServico() {
		return produtoServico;
	}

	public void setProdutoServico(List<ProdutoServico> produtoServico) {
		this.produtoServico = produtoServico;
	}

	@Override
    public String toString() {
        return nomeFantasia;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fornecedor) {
            Fornecedor i = (Fornecedor) obj;
            return i.getId().equals(this.getId());
        }
        return false;
    }
    
}
