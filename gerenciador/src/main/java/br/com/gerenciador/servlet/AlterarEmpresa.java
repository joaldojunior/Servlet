package br.com.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.gerenciador.model.Empresa;
import br.com.gerenciador.util.Banco;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlterarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sId = request.getParameter("id");
		Integer id = Integer.valueOf(sId);
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		
		Empresa empresa = new Empresa();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataa = new Date();
		try {
			dataa = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Banco banco = new Banco();
		empresa = banco.findById(id);
		
		empresa.setNome(nome);
		empresa.setData(dataa);
		
		response.sendRedirect("listaEmpresas");
	}

}
