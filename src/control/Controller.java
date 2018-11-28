package control;

import java.io.IOException;
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
	}
}
