package control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
		
		if (acao.contains("deletarTipoDeConta") ){
			Long id = Long.parseLong(req.getParameter("id")); 
			TipoDeContaController.getInstance().deletar(TipoDeContaController.getInstance().buscarPoriD(id));
		}
		
		if (acao.contains("deletarTipoDeVacina") ){
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

}
