package br.com.gerenciador.util;

import java.util.ArrayList;
import java.util.List;

import br.com.gerenciador.model.Empresa;

public class Banco {

	private static List<Empresa> lista = new ArrayList();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		lista.add(empresa1);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("ZUP");
		lista.add(empresa2);
	}
	public void insert(Empresa empresa) {
		lista.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
