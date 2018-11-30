package control;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
import model.Tipo;
import model.TipoDeConta;
import model.TipoDeVacina;
import model.Usuario;
import model.Vacina;
import model.VendaServico;


@WebServlet("/controller")
public class Controller extends HttpServlet {


	private static final long serialVersionUID = -1611850246097453697L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 	throws ServletException, IOException {
		String acao = req.getParameter("acao");
		
		if (acao.contains("deletarAgendamentoConsulta") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			AgendamentoConsultaController.getInstance().deletar(AgendamentoConsultaController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarAnamnese") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			AnamneseController.getInstance().deletar(AnamneseController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarAnimal") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			AnimalController.getInstance().deletar(AnimalController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarCliente") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			ClienteController.getInstance().deletar(ClienteController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarContasAPagar") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			ContasAPagarController.getInstance().deletar(ContasAPagarController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarFichaAnimal") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			FichaAnimalController.getInstance().deletar(FichaAnimalController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarFormaDePagamento") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			FormaDePagamentoController.getInstance().deletar(FormaDePagamentoController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarFornecedor") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			FornecedorController.getInstance().deletar(FornecedorController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarFuncionario") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			FuncionarioController.getInstance().deletar(FuncionarioController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarProdutoServico") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			ProdutoServicoController.getInstance().deletar(ProdutoServicoController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarProdutoServicoVendaServico") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			ProdutoServicoVendaServicoController.getInstance().deletar(ProdutoServicoVendaServicoController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarTipo") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			TipoController.getInstance().deletar(TipoController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarDeConta") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			TipoDeContaController.getInstance().deletar(TipoDeContaController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarDeVacina") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			TipoDeVacinaController.getInstance().deletar(TipoDeVacinaController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarUsuario") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			UsuarioController.getInstance().deletar(UsuarioController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarVacina") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			VacinaController.getInstance().deletar(VacinaController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarVendaServico") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			VendaServicoController.getInstance().deletar(VendaServicoController.getInstance().buscarPoriD(id));
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/excluirSucesso.jsp");
        rd.forward(req, resp);
	}
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		
		//Quando nenhuma acao for passada redireciona para a pagina de erro
		if (acao == null || acao.equals("")){
			RequestDispatcher rd = req.getRequestDispatcher("/erro.jsp");
	        rd.forward(req, resp);	
		}
		
		System.out.print(acao);
		
		
		if (acao.equals("cadastrarAgendamento")) {
			String descricao = req.getParameter("ndescricao");
		    String status =  req.getParameter("nstatus");
		    String data = req.getParameter("ndatan");
		    String cliente = req.getParameter("ncomboCliente"); 
				
		    AgendamentoConsulta agendamento = new AgendamentoConsulta();
		    Date date = new Date(data);
			agendamento.setDataDeAgendamento(date);
			agendamento.setDescricao(descricao);
			agendamento.setStatus(status);
			agendamento.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
			AgendamentoConsultaController.getInstance().persistir(agendamento);

			RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAgendamentoConsultaSucesso.jsp");
	        rd.forward(req, resp);
		}
		
		if (acao.equals("editarAgendamento")) {
			String descricao = req.getParameter("ndescricao");
		    String status =  req.getParameter("nstatus");
		    String data = req.getParameter("ndatan");
		    String cliente = req.getParameter("ncomboCliente");
		    String id = req.getParameter("nid");
				
			AgendamentoConsulta agendamento = new AgendamentoConsulta();
			agendamento.setId(Long.parseLong(id));
			Date date = new Date(data);
			agendamento.setDataDeAgendamento(date);
			agendamento.setDescricao(descricao);
			agendamento.setStatus(status);
			agendamento.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
			AgendamentoConsultaController.getInstance().persistir(agendamento);
			
			RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAgendamentoConsultaSucesso.jsp");
	        rd.forward(req, resp);
		}
		
		if (acao.equals("cadastrarAnamnese")) {
			
			String diagnostico = req.getParameter("ndiagnostico");
			String anamnese =  req.getParameter("nanamnese");
			String medicamentos =  req.getParameter("nmedicamentos");
			String procedimentosRealizados =  req.getParameter("nprocedimentosrealizados");
			String fichaAnimal = req.getParameter("ncomboFicha");
			
			Anamnese anamneses = new Anamnese();
			anamneses.setDiagnostico(diagnostico);
			anamneses.setAnamnese(anamnese);
			anamneses.setMedicamentos(medicamentos);
			anamneses.setProcedimentosRealizados(procedimentosRealizados);
			anamneses.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(fichaAnimal)));

			AnamneseController.getInstance().persistir(anamneses);
			
			RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAnamneseSucesso.jsp");
	        rd.forward(req, resp);
		}
		
			if (acao.equals("editarAnamnese")) {
			String diagnostico = req.getParameter("ndiagnostico");
			String anamnese =  req.getParameter("nanamnese");
			String medicamentos =  req.getParameter("nmedicamento");
			String procedimentosRealizados =  req.getParameter("nprocedimentosrealizados");
			String fichaAnimal = req.getParameter("ncomboFicha");
			String id = req.getParameter("nid");
			
			Anamnese anamneses = new Anamnese();
			anamneses.setId(Long.parseLong(id));
			anamneses.setDiagnostico(diagnostico);
			anamneses.setAnamnese(anamnese);
			anamneses.setMedicamentos(medicamentos);
			anamneses.setProcedimentosRealizados(procedimentosRealizados);
			anamneses.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(fichaAnimal)));

			AnamneseController.getInstance().persistir(anamneses);
			
			RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAnamneseSucesso.jsp");
	        rd.forward(req, resp);
		}
			
			if (acao.equals("cadastrarAnimal")) {
				
				String nome = req.getParameter("nnome");
			    String raca =  req.getParameter("nraca");
			    String peso =  req.getParameter("npeso");
			    String especie =  req.getParameter("nespecie");
			    String data = req.getParameter("ndatan");
			    String sexo =  req.getParameter("nsexo");
			    String cliente = req.getParameter("ncomboCliente");
					
				Animal animal = new Animal();
				Date date = new Date(data);
				animal.setDataNascimento(date);
				animal.setNome(nome);
				animal.setRaca(raca);
				animal.setPesoOuPorte(peso);
				animal.setEspecie(especie);
				animal.setSexo(sexo);
				animal.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
				AnimalController.getInstance().persistir(animal);

				RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAnimalSucesso.jsp");
		        rd.forward(req, resp);
			}
			
			if (acao.equals("editarAnimal")) {
				String nome = req.getParameter("nnome");
			    String raca =  req.getParameter("nraca");
			    String peso =  req.getParameter("npeso");
			    String especie =  req.getParameter("nespecie");
			    String data = req.getParameter("ndatan");
			    String sexo =  req.getParameter("nsexo");
			    String cliente = req.getParameter("ncomboCliente");
			    String id = req.getParameter("nid");

					Animal animal = new Animal();
					Date date = new Date(data);
		            animal.setDataNascimento(date);
					animal.setId(Long.parseLong(id));
					animal.setNome(nome);
					animal.setRaca(raca);
					animal.setPesoOuPorte(peso);
					animal.setEspecie(especie);
					animal.setSexo(sexo);
				    animal.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
					AnimalController.getInstance().persistir(animal);
					

					RequestDispatcher rd = req.getRequestDispatcher("/cadastrarAnimalSucesso.jsp");
			        rd.forward(req, resp);
			}
	if (acao.equals("cadastrarCliente")) {
				
		String nome = req.getParameter("nnome");
	    String cpf =  req.getParameter("ncpf");
	    String rg =  req.getParameter("nrg");
	    String telefone =  req.getParameter("ntelefone");
	    String email =  req.getParameter("nemail");
	    String rua =  req.getParameter("nrua");
	    String numero =  req.getParameter("nnumero");
	    String bairro =  req.getParameter("nbairro");
	    String cidade =  req.getParameter("ncidade");
	    String cep =  req.getParameter("ncep");
					
				Cliente cliente = new Cliente();
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setRg(rg);
				cliente.setTelefone(telefone);
				cliente.setEmail(email);
				cliente.setRua(rua);
				cliente.setNumero(numero);
				cliente.setBairro(bairro);
				cliente.setCidade(cidade);
				cliente.setCep(cep);
				ClienteController.getInstance().persistir(cliente);

				RequestDispatcher rd = req.getRequestDispatcher("/cadastrarClienteSucesso.jsp");
		        rd.forward(req, resp);
			}
			
			if (acao.equals("editarCliente")) {
				String nome = req.getParameter("nnome");
			    String cpf =  req.getParameter("ncpf");
			    String rg =  req.getParameter("nrg");
			    String telefone =  req.getParameter("ntelefone");
			    String email =  req.getParameter("nemail");
			    String rua =  req.getParameter("nrua");
			    String numero =  req.getParameter("nnumero");
			    String bairro =  req.getParameter("nbairro");
			    String cidade =  req.getParameter("ncidade");
			    String cep =  req.getParameter("ncep");
			    String id = req.getParameter("nid");

					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					cliente.setCpf(cpf);
					cliente.setRg(rg);
					cliente.setTelefone(telefone);
					cliente.setEmail(email);
					cliente.setRua(rua);
					cliente.setNumero(numero);
					cliente.setBairro(bairro);
					cliente.setCidade(cidade);
					cliente.setCep(cep);
					cliente.setId(Long.parseLong(id));
				    
					ClienteController.getInstance().persistir(cliente);
					

					RequestDispatcher rd = req.getRequestDispatcher("/cadastrarClienteSucesso.jsp");
			        rd.forward(req, resp);
			}	
			
			
			if (acao.equals("cadastrarContasAPagar")) {
				
				String fornecedor = req.getParameter("ncomboForn");

			    String tipo = req.getParameter("ncomboTipo");

			    String data = req.getParameter("ndatan");
			    
			    Double valor = Double.parseDouble(req.getParameter("nvalor"));	
			    
				   ContasAPagar conta = new ContasAPagar();
				   Date date = new Date(data);
				   conta.setData(date);
				   conta.setValor(BigDecimal.valueOf(valor));
				   conta.setFornecedor(FornecedorController.getInstance().buscarPoriD(Long.parseLong(fornecedor)));
			       conta.setTipoDeConta(TipoDeContaController.getInstance().buscarPoriD(Long.parseLong(tipo)));
			       ContasAPagarController.getInstance().persistir(conta);


						RequestDispatcher rd = req.getRequestDispatcher("/cadastrarContasPagarSucesso.jsp");
				        rd.forward(req, resp);
					}
					
					if (acao.equals("editarContasAPagar")) {
						String fornecedor = req.getParameter("ncomboForn");

					    String tipo = req.getParameter("ncomboTipo");

					    String data = req.getParameter("ndatan");
					    
					    Double valor = Double.parseDouble(req.getParameter("nvalor"));	
					    
					    String id = req.getParameter("nid");
					    
						   ContasAPagar conta = new ContasAPagar();
						   Date date = new Date(data);
						   conta.setData(date);
						   conta.setValor(BigDecimal.valueOf(valor));
						   conta.setFornecedor(FornecedorController.getInstance().buscarPoriD(Long.parseLong(fornecedor)));
						   conta.setTipoDeConta(TipoDeContaController.getInstance().buscarPoriD(Long.parseLong(tipo)));
					       conta.setId(Long.parseLong(id));

					       ContasAPagarController.getInstance().persistir(conta);
							

							RequestDispatcher rd = req.getRequestDispatcher("/cadastrarContasPagarSucesso.jsp");
					        rd.forward(req, resp);
					}
					
					if (acao.equals("cadastrarFichaAnimal")) {
						String pesoantes = req.getParameter("npesoantes");

					    String animal = req.getParameter("ncomboAnimal");

									
					    FichaAnimal fichanimal = new FichaAnimal();
						fichanimal.setPesoOuPorteAntesDoProcedimento(pesoantes);
					   fichanimal.setAnimal(AnimalController.getInstance().buscarPoriD(Long.parseLong(animal)));
						FichaAnimalController.getInstance().persistir(fichanimal);

								RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFichaAnimalSucesso.jsp");
						        rd.forward(req, resp);
							}
							
							if (acao.equals("editarFichaAnimal")) {
								String pesoantes = req.getParameter("npesoantes");

							    String animal = req.getParameter("ncomboAnimal");

							    String id = req.getParameter("nid");

							    FichaAnimal fichanimal = new FichaAnimal();
								fichanimal.setPesoOuPorteAntesDoProcedimento(pesoantes);
							   fichanimal.setAnimal(AnimalController.getInstance().buscarPoriD(Long.parseLong(animal)));
								fichanimal.setId(Long.parseLong(id));
							   FichaAnimalController.getInstance().persistir(fichanimal);
									

									RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFichaAnimalSucesso.jsp");
							        rd.forward(req, resp);
							}	
							if (acao.equals("cadastrarFormaPagamento")) {
								String descricao = req.getParameter("ndescricaopag");
											
								FormaDePagamento formapagamento = new FormaDePagamento();
								formapagamento.setDescricao(descricao);	 
								FormaDePagamentoController.getInstance().persistir(formapagamento);

										RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFormaPagamentoSucesso.jsp");
								        rd.forward(req, resp);
									}
									
									if (acao.equals("editarFormaPagamento")) {
										String descricao = req.getParameter("ndescricaopag");
									    String id = req.getParameter("nid");
									 

										
										FormaDePagamento formapagamento = new FormaDePagamento();
										formapagamento.setDescricao(descricao);	 
										formapagamento.setId(Long.parseLong(id));
										FormaDePagamentoController.getInstance().persistir(formapagamento);
											

											RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFormaPagamentoSucesso.jsp");
									        rd.forward(req, resp);
									}										
									if (acao.equals("cadastrarFornecedor")) {
										
										String apelido = req.getParameter("napelido");
									    String cnpj =  req.getParameter("ncnpj");
									    String razaosocial =  req.getParameter("nrazaosocial");
									    String telefone =  req.getParameter("ntelefone");
									    String rua =  req.getParameter("nrua");
									    String numero =  req.getParameter("nnumero");
									    String bairro =  req.getParameter("nbairro");
									    String cidade =  req.getParameter("ncidade");
									    String cep =  req.getParameter("ncep");
							
									    Fornecedor fornecedor = new Fornecedor();			
									    fornecedor.setNomeFantasia(apelido);
										fornecedor.setCnpj(cnpj);
										fornecedor.setRazaoSocial(razaosocial);
										fornecedor.setTelefone(telefone);		
										fornecedor.setRua(rua);
										fornecedor.setNumero(numero);
										fornecedor.setBairro(bairro);
										fornecedor.setCidade(cidade);
										fornecedor.setCep(cep);
										FornecedorController.getInstance().persistir(fornecedor);
								

												RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFornecedorSucesso.jsp");
										        rd.forward(req, resp);
											}
											
											if (acao.equals("editarFornecedor")) {
												String apelido = req.getParameter("napelido");
											    String cnpj =  req.getParameter("ncnpj");
											    String razaosocial =  req.getParameter("nrazaosocial");
											    String telefone =  req.getParameter("ntelefone");
											    String rua =  req.getParameter("nrua");
											    String numero =  req.getParameter("nnumero");
											    String bairro =  req.getParameter("nbairro");
											    String cidade =  req.getParameter("ncidade");
											    String cep =  req.getParameter("ncep");
											    String id = req.getParameter("nid");

											    Fornecedor fornecedor = new Fornecedor();
												fornecedor.setNomeFantasia(apelido);
												fornecedor.setCnpj(cnpj);
												fornecedor.setRazaoSocial(razaosocial);
												fornecedor.setTelefone(telefone);		
												fornecedor.setRua(rua);
												fornecedor.setNumero(numero);
												fornecedor.setBairro(bairro);
												fornecedor.setCidade(cidade);
												fornecedor.setCep(cep);
												fornecedor.setId(Long.parseLong(id));
												FornecedorController.getInstance().persistir(fornecedor);
													
												 
													

													RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFornecedorSucesso.jsp");
											        rd.forward(req, resp);
											}		
											if (acao.equals("cadastrarFuncionario")) {
												
												String nome = req.getParameter("nnome");
											    String cpf =  req.getParameter("ncpf");
											    String rg =  req.getParameter("nrg");
											    String telefone =  req.getParameter("ntelefone");
											    String email =  req.getParameter("nemail");
											    String rua =  req.getParameter("nrua");
											    String numero =  req.getParameter("nnumero");
											    String bairro =  req.getParameter("nbairro");
											    String cidade =  req.getParameter("ncidade");
											    String cep =  req.getParameter("ncep");
											    String titulo =  req.getParameter("ntitulo");
											    String pis = req.getParameter("npis");
											    String funcao = req.getParameter("nfuncao");
											    String usuario = req.getParameter("ncomboUsuario");
											    String estadocivil = req.getParameter("nestadocivil");
									
											    Funcionario funcionario = new Funcionario();
											    
												
												funcionario.setNome(nome);
												funcionario.setCpf(cpf);
												funcionario.setRg(rg);
												funcionario.setTelefone(telefone);
												funcionario.setEmail(email);
												funcionario.setRua(rua);
												funcionario.setNumero(numero);
												funcionario.setBairro(bairro);
												funcionario.setCidade(cidade);
												funcionario.setCep(cep);
												funcionario.setTituloDeEleitor(titulo);
												funcionario.setPis(pis);
												funcionario.setFuncao(funcao);
												 funcionario.setUsuarios(UsuarioController.getInstance().buscarPoriD(Long.parseLong(usuario)));
											    funcionario.setEstadoCivil(EstadoCivilEnum.fromInt(Integer.parseInt(estadocivil)));
											    
												FuncionarioController.getInstance().persistir(funcionario);
										

														RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFuncionarioSucesso.jsp");
												        rd.forward(req, resp);
													}
													
													if (acao.equals("editarFuncionario")) {

														String nome = req.getParameter("nnome");
													    String cpf =  req.getParameter("ncpf");
													    String rg =  req.getParameter("nrg");
													    String telefone =  req.getParameter("ntelefone");
													    String email =  req.getParameter("nemail");
													    String rua =  req.getParameter("nrua");
													    String numero =  req.getParameter("nnumero");
													    String bairro =  req.getParameter("nbairro");
													    String cidade =  req.getParameter("ncidade");
													    String cep =  req.getParameter("ncep");
													    String titulo =  req.getParameter("ntitulo");
													    String pis = req.getParameter("npis");
													    String funcao = req.getParameter("nfuncao");
													    String usuario = req.getParameter("ncomboUsuario");
													    String estadocivil = req.getParameter("nestadocivil");
													    String id = req.getParameter("nid");

													    Funcionario funcionario = new Funcionario();
													    
														funcionario.setId(Long.parseLong(id));
														funcionario.setNome(nome);
														funcionario.setCpf(cpf);
														funcionario.setRg(rg);
														funcionario.setTelefone(telefone);
														funcionario.setEmail(email);
														funcionario.setRua(rua);
														funcionario.setNumero(numero);
														funcionario.setBairro(bairro);
														funcionario.setCidade(cidade);
														funcionario.setCep(cep);
														funcionario.setTituloDeEleitor(titulo);
														funcionario.setPis(pis);
														funcionario.setFuncao(funcao);
														 funcionario.setUsuarios(UsuarioController.getInstance().buscarPoriD(Long.parseLong(usuario)));
													    funcionario.setEstadoCivil(EstadoCivilEnum.fromInt(Integer.parseInt(estadocivil)));
														FuncionarioController.getInstance().persistir(funcionario);
															
														 
															

															RequestDispatcher rd = req.getRequestDispatcher("/cadastrarFuncionarioSucesso.jsp");
													        rd.forward(req, resp);
													}		
													if (acao.equals("cadastrarProdutoServico")) {
														String nome = req.getParameter("nnomeprod");
													    String marca =  req.getParameter("nmarca");
													    String lote = req.getParameter("nlote");
													    String tipo = req.getParameter("ncomboTipo");
													    String data = req.getParameter("ndatan");
													    Double precovenda = Double.parseDouble(req.getParameter("nprecovenda"));
													    Double precocompra = Double.parseDouble(req.getParameter("nprecocompra"));
													    
													    ProdutoServico produtoservico = new ProdutoServico();
														
													    Date date = new Date(data);
														produtoservico.setValidade(date);
														produtoservico.setNome(nome);
														produtoservico.setMarca(marca);
														produtoservico.setPrecoDeVenda(BigDecimal.valueOf(precovenda));
														produtoservico.setPrecoDeCompra(BigDecimal.valueOf(precocompra));
														produtoservico.setLote(lote);
														produtoservico.setTipo(TipoController.getInstance().buscarPoriD(Long.parseLong(tipo)));
														
																
														ProdutoServicoController.getInstance().persistir(produtoservico);

																RequestDispatcher rd = req.getRequestDispatcher("/cadastrarProdutoServicoSucesso.jsp");
														        rd.forward(req, resp);
															}
															
															if (acao.equals("editarProdutoServico")) {
																String nome = req.getParameter("nnomeprod");
															    String marca =  req.getParameter("nmarca");
															    String lote = req.getParameter("nlote");
															    String tipo = req.getParameter("ncomboTipo");
															    String data = req.getParameter("ndatan");
															    Double precovenda = Double.parseDouble(req.getParameter("nprecovenda"));
															    Double precocompra = Double.parseDouble(req.getParameter("nprecocompra"));
															    String id = req.getParameter("nid");
															    

																
															    ProdutoServico produtoservico = new ProdutoServico();
																
															    Date date = new Date(data);
																produtoservico.setValidade(date);
																produtoservico.setNome(nome);
																produtoservico.setMarca(marca);
																produtoservico.setPrecoDeVenda(BigDecimal.valueOf(precovenda));
																produtoservico.setPrecoDeCompra(BigDecimal.valueOf(precocompra));
																produtoservico.setLote(lote);
																produtoservico.setId(Long.parseLong(id));
																produtoservico.setTipo(TipoController.getInstance().buscarPoriD(Long.parseLong(tipo)));
																
																		
																ProdutoServicoController.getInstance().persistir(produtoservico);
																	

																	RequestDispatcher rd = req.getRequestDispatcher("/cadastrarProdutoServicoSucesso.jsp");
															        rd.forward(req, resp);
															}
															if (acao.equals("cadastrarTipo")) {
																String descricao = req.getParameter("ndescricao");
																			
																Tipo tipo = new Tipo();
																tipo.setDescricao(descricao);
																TipoController.getInstance().persistir(tipo);

																		RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoSucesso.jsp");
																        rd.forward(req, resp);
																	}
																	
																	if (acao.equals("editarTipo")) {
																		String descricao = req.getParameter("ndescricao");
																	    String id = req.getParameter("nid");
																	 

																		
																	    Tipo tipo = new Tipo();
																		tipo.setDescricao(descricao);
																		
																		tipo.setId(Long.parseLong(id));
																		TipoController.getInstance().persistir(tipo);
																			

																			RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoSucesso.jsp");
																	        rd.forward(req, resp);
																	}
																	if (acao.equals("cadastrarTConta")) {
																		String descricao = req.getParameter("ndescricaoconta");
																					
																		TipoDeConta tipoc = new TipoDeConta();
																		tipoc.setDescricao(descricao);
																		TipoDeContaController.getInstance().persistir(tipoc);

																				RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoContaSucesso.jsp");
																		        rd.forward(req, resp);
																			}
																			
																			if (acao.equals("editarTConta")) {
																				String descricao = req.getParameter("ndescricaoconta");
																			    String id = req.getParameter("nid");
																			 

																				
																			    TipoDeConta tipoc = new TipoDeConta();
																				tipoc.setDescricao(descricao);
																				
																				tipoc.setId(Long.parseLong(id));
																				TipoDeContaController.getInstance().persistir(tipoc);
																					

																					RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoContaSucesso.jsp");
																			        rd.forward(req, resp);
																			}
																			if (acao.equals("cadastrarTVacina")) {
																				String descricao = req.getParameter("ndescricao");
																							
																				TipoDeVacina tvacina = new TipoDeVacina();
																				tvacina.setDescricao(descricao);
																				TipoDeVacinaController.getInstance().persistir(tvacina);

																						RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoVacinaSucesso.jsp");
																				        rd.forward(req, resp);
																					}
																					
																					if (acao.equals("editarTVacina")) {
																						String descricao = req.getParameter("ndescricao");
																					    String id = req.getParameter("nid");
																					    
																						TipoDeVacina tvacina = new TipoDeVacina();
																						tvacina.setDescricao(descricao);																				
																						tvacina.setId(Long.parseLong(id));
																						TipoDeVacinaController.getInstance().persistir(tvacina);
																							

																							RequestDispatcher rd = req.getRequestDispatcher("/cadastrarTipoVacinaSucesso.jsp");
																					        rd.forward(req, resp);
																					}
																					if (acao.equals("cadastrarUsuario")) {

																						String login = req.getParameter("nlogin");
																						String senha = req.getParameter("nsenha");
																						Usuario usuario = new Usuario();
																						usuario.setLogin(login);
																						usuario.setSenha(senha);
																					 
																						UsuarioController.getInstance().persistir(usuario);

																								RequestDispatcher rd = req.getRequestDispatcher("/cadastrarUsuarioSucesso.jsp");
																						        rd.forward(req, resp);
																							}
																							
																							if (acao.equals("editarUsuario")) {
																								String login = req.getParameter("nlogin");
																							    String senha = req.getParameter("nsenha");
																							    String id = req.getParameter("nid");
																							    Usuario usuario = new Usuario();
																								usuario.setId(Long.parseLong(id));
																								usuario.setLogin(login);
																								usuario.setSenha(senha);
																							 
																								UsuarioController.getInstance().persistir(usuario);

																									

																									RequestDispatcher rd = req.getRequestDispatcher("/cadastrarUsuarioSucesso.jsp");
																							        rd.forward(req, resp);
																							}
																							if (acao.equals("cadastrarVacina")) {

																								String marca = req.getParameter("nmarca");
																							    String lote =  req.getParameter("nlote");
																							    String fornecedor =  req.getParameter("nfornecedor");
																							    String data = req.getParameter("ndatan");
																							    String ficha = req.getParameter("ncomboFicha");
																							    String tipo = req.getParameter("ncombotipov");
																							    Double custo = Double.parseDouble(req.getParameter("ncusto"));	
																							    
																								    Vacina vacina = new Vacina();	
																									Date date = new Date(data);
																									vacina.setValidade(date);
																								    vacina.setMarca(marca);
																								    vacina.setLote(lote);
																								    vacina.setFornecedor(fornecedor);
																								    vacina.setCusto(BigDecimal.valueOf(custo));
																								    vacina.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(ficha)));
																									vacina.setTipoDeVacina(TipoDeVacinaController.getInstance().buscarPoriD(Long.parseLong(tipo)));
																								  
																									VacinaController.getInstance().persistir(vacina);

																										RequestDispatcher rd = req.getRequestDispatcher("/cadastrarVacinaSucesso.jsp");
																								        rd.forward(req, resp);
																									}
																									
																									if (acao.equals("editarVacina")) {
																										String marca = req.getParameter("nmarca");
																									    String lote =  req.getParameter("nlote");
																									    String fornecedor =  req.getParameter("nfornecedor");
																									    String data = req.getParameter("ndatan");
																									    String ficha = req.getParameter("ncomboFicha");
																									    String tipo = req.getParameter("ncombotipov");
																									    String id = req.getParameter("nid");
																										
																										Double custo = Double.parseDouble(req.getParameter("ncusto"));	
																											
																										Vacina vacina = new Vacina();	
																										
																										    vacina.setId(Long.parseLong(id));
																										    Date date = new Date(data);
																											vacina.setValidade(date);
																										    vacina.setMarca(marca);
																										    vacina.setLote(lote);
																										    vacina.setFornecedor(fornecedor);
																										    vacina.setCusto(BigDecimal.valueOf(custo));
																										    vacina.setFichaAnimal(FichaAnimalController.getInstance().buscarPoriD(Long.parseLong(ficha)));
																											vacina.setTipoDeVacina(TipoDeVacinaController.getInstance().buscarPoriD(Long.parseLong(tipo)));
																										  
																											VacinaController.getInstance().persistir(vacina);

																											

																											RequestDispatcher rd = req.getRequestDispatcher("/cadastrarVacinaSucesso.jsp");																						        rd.forward(req, resp);
																									
			}
																									if (acao.equals("cadastrarVendaServico")) {
																										String descricao = req.getParameter("ndescricao");
																										
																									    String cliente = req.getParameter("ncomboCliente");

																									    String data = req.getParameter("ndatan");
																									    
																									    String funcionario = req.getParameter("ncomboFuncionario");
																									    
																									    String id = req.getParameter("nid");
																							         	Double vtotal = Double.parseDouble(req.getParameter("nvtotal"));	
																											
																											VendaServico vendaservico = new VendaServico();
																											Date date = new Date(data);
																											vendaservico.setDataServico(date);
																											vendaservico.setDescricao(descricao);
																											vendaservico.setValorTotal(BigDecimal.valueOf(vtotal));
																											vendaservico.setFuncionario(FuncionarioController.getInstance().buscarPoriD(Long.parseLong(funcionario)));
																								            vendaservico.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
																											VendaServicoController.getInstance().persistir(vendaservico);

																												RequestDispatcher rd = req.getRequestDispatcher("/cadastrarVendaServicoSucesso.jsp");
																										        rd.forward(req, resp);
																											}
																											
																											if (acao.equals("editarVendaServico")) {
																												String descricao = req.getParameter("ndescricao");
																												
																											    String cliente = req.getParameter("ncomboCliente");
																											    
																											    String data = req.getParameter("ndatan");

																											    String funcionario = req.getParameter("ncomboFuncionario");
																											    
																											    String id = req.getParameter("nid");
																												
																													Double vtotal = Double.parseDouble(req.getParameter("nvtotal"));	
																													
																													
																													VendaServico vendaservico = new VendaServico();
																													vendaservico.setId(Long.parseLong(id));
																													Date date = new Date(data);
																													vendaservico.setDataServico(date);
																													vendaservico.setDescricao(descricao);
																													vendaservico.setValorTotal(BigDecimal.valueOf(vtotal));
																													vendaservico.setFuncionario(FuncionarioController.getInstance().buscarPoriD(Long.parseLong(funcionario)));
																										            vendaservico.setCliente(ClienteController.getInstance().buscarPoriD(Long.parseLong(cliente)));
																													VendaServicoController.getInstance().persistir(vendaservico);
																													

																													RequestDispatcher rd = req.getRequestDispatcher("/cadastrarVendaServicoSucesso.jsp");
																											        rd.forward(req, resp);
																											}
	}
}
