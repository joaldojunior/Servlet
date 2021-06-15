package br.com.gerenciador.servlet;

import java.io.IOException;

import br.com.gerenciador.model.Empresa;
import br.com.gerenciador.util.Banco;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mostraEmpresa")
public class MostrarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sId = request.getParameter("id");
		Integer id = Integer.valueOf(sId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.findById(id);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/alterarEmpresa.jsp");
		rd.forward(request, response);
	}

}
