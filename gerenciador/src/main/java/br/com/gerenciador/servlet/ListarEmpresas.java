package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.gerenciador.model.Empresa;
import br.com.gerenciador.util.Banco;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListarEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas.jsp");
		rd.forward(request, response);
	}

}
