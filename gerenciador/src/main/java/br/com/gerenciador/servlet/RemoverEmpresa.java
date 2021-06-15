package br.com.gerenciador.servlet;

import java.io.IOException;

import br.com.gerenciador.util.Banco;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/removeEmpresa")
public class RemoverEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sId = request.getParameter("id");
		Integer id = Integer.valueOf(sId);
		
		Banco banco = new Banco();
		banco.delete(id);
		
		response.sendRedirect("listaEmpresas");
	}

}
