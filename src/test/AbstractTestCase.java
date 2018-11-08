package test;

import java.math.BigDecimal;
import java.util.Calendar;

import model.AgendamentoConsulta;
import model.Anamnese;
import model.Animal;
import model.Cliente;
import model.ContasAPagar;
import model.EstadoCivilEnum;
import model.FichaAnimal;
import model.FormaDePagamento;
import model.Fornecedor;
import model.Funcionario;
import model.ProdutoServico;
import model.ProdutoServicoVendaServico;
import model.Tipo;
import model.TipoDeConta;
import model.TipoDeVacina;
import model.Usuario;
import model.Vacina;
import model.VendaServico;

public class AbstractTestCase {

  public Tipo getTipoFake() {
	  Tipo tipo = new Tipo();
	  tipo.setDescricao("Tipotestedescri");
	  return tipo;
  }
  
  public ProdutoServico getProdutoServicoFake() {
	  ProdutoServico produtoServico = new ProdutoServico();
		produtoServico.setLote("231231038sdsd");
		produtoServico.setMarca("topterp");
		produtoServico.setNome("topterm philipsbalita");
		produtoServico.setPrecoDeCompra(BigDecimal.ONE);
		produtoServico.setPrecoDeVenda(BigDecimal.TEN);
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		produtoServico.setValidade(c);
		
	  
	  return produtoServico;
  }
  
  public AgendamentoConsulta getAgendamentoConsultaFake() {
	  AgendamentoConsulta agendamentoConsulta = new AgendamentoConsulta();
		agendamentoConsulta.setDescricao("testedesc");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		agendamentoConsulta.setDataDeAgendamento(c);
		agendamentoConsulta.setStatus("testestatus");
		return agendamentoConsulta;
  }
  
  public Cliente getClienteFake() {
	  Cliente cliente = new Cliente();
		cliente.setNome("TesteNome");
		cliente.setBairro("testebairro");
		cliente.setCep("35365970");
		cliente.setCidade("testecidade");
		cliente.setCpf("72765507023");
		cliente.setEmail("testeemail@email.com");
		cliente.setNumero("1356");;
		cliente.setRg("146161713");
		cliente.setRua("ruateste");
		cliente.setTelefone("3212312321");
		
	    return cliente;
  }
  
  public Animal getAnimalFake() {
	  	Animal animal = new Animal();
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		animal.setNome("rubens");
		animal.setPesoOuPorte("medio");
		animal.setDataNascimento(c);
		animal.setEspecie("teste");
		animal.setRaca("teste2");
		animal.setSexo("macho");
		return animal;
  }

  public Anamnese getAnamneseFake() {
	  Anamnese anamnese = new Anamnese();
		anamnese.setAnamnese("testeanamnese");
		anamnese.setDiagnostico("testediag");
		anamnese.setMedicamentos("testmedicamento");
		anamnese.setProcedimentosRealizados("testeprocedimento");
		
		return anamnese;
  }
  
  public ContasAPagar getContasAPagarFake() {
	  ContasAPagar contasAPagar = new ContasAPagar();
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		contasAPagar.setData(c);
		contasAPagar.setValor(BigDecimal.TEN);
		return contasAPagar;
  }
  
  public FichaAnimal getFichaAnimalFake() {
	  FichaAnimal fichaAnimal = new FichaAnimal();
	  fichaAnimal.setPesoOuPorteAntesDoProcedimento("testeppap");
	  return fichaAnimal;
  }
  
  public FormaDePagamento getFormaDePagamentoFake() {
	  FormaDePagamento formaDePagamento = new FormaDePagamento();
	  formaDePagamento.setDescricao("descriçãoteste");
	  return formaDePagamento;
  }
  
  public Fornecedor getFornecedorFake() {
	  Fornecedor fornecedor = new Fornecedor();
	  fornecedor.setBairro("testebairro");
		fornecedor.setCep("35365970");
		fornecedor.setCidade("testecidade");
		fornecedor.setCnpj("15976430000110");
		fornecedor.setNomeFantasia("nomefantasiateste");
		fornecedor.setNumero("32");
		fornecedor.setRazaoSocial("testerazaosocial");
		fornecedor.setRua("ruateste");
		fornecedor.setTelefone("3212312321");
		
		return fornecedor;
  }
  
 public Funcionario getFuncionarioFake() {
	 Funcionario funcionario = new Funcionario();
	 
	funcionario.setNome("TesteNome");
	funcionario.setBairro("testebairro");
	funcionario.setCep("35365970");
	funcionario.setCidade("testecidade");
	funcionario.setCpf("72765507023");
	funcionario.setEmail("testeemail@email.com");
	funcionario.setEstadoCivil(EstadoCivilEnum.Solteiro);
	funcionario.setFuncao("testefuncao");
	funcionario.setNumero("1356");
	funcionario.setPis("06353256730");
	funcionario.setRg("146161713");
	funcionario.setRua("ruateste");
	funcionario.setTelefone("3212312321");
	funcionario.setTituloDeEleitor("422873420108");
	
	return funcionario;
 }
 
 public ProdutoServicoVendaServico getProdutoServicoVendaServicoFake() {
	 ProdutoServicoVendaServico produtoServicoVendaServico = new ProdutoServicoVendaServico();
	 produtoServicoVendaServico.setQuantidadeProduto(12);
	 produtoServicoVendaServico.setValorProduto(BigDecimal.TEN);
	 
	 return produtoServicoVendaServico;
 }
 
 public TipoDeConta getTipoDeContaFake() {
	 TipoDeConta tipoDeConta = new TipoDeConta();
	 tipoDeConta.setDescricao("testetipoconta");
	 return tipoDeConta;
 }
 
 public TipoDeVacina getTipoDeVacinaFake() {
	 TipoDeVacina tipoDeVacina = new TipoDeVacina();
	 tipoDeVacina.setDescricao("testedescrição");
	 return tipoDeVacina;
 }
 
 public Usuario getUsuarioFake() {
	 Usuario usuario = new Usuario();
	usuario.setLogin("teste123");
	usuario.setSenha("teste123");
	
	 return usuario;
 }
 
 public Vacina getVacinaFake() {
	 Vacina vacina = new Vacina();
		vacina.setCusto(BigDecimal.valueOf(120.00));
		vacina.setFornecedor("testefornecedor");
		vacina.setLote("testelote456412");
		vacina.setMarca("toppex");
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vacina.setValidade(c);
	 return vacina;
 }
 
 public VendaServico getVendaServicoFake() {
	 VendaServico vendaServico = new VendaServico();
		Calendar c = Calendar.getInstance();
		c.set(2012, 12, 1);
		vendaServico.setDataServico(c);
		vendaServico.setDescricao("testedescrição");
		vendaServico.setValorTotal(BigDecimal.TEN);
		
		return vendaServico;
 }
}
