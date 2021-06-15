package br.com.gerenciador.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.gerenciador.model.Empresa;

public class Banco {

	private static List<Empresa> lista = new ArrayList();
	private static Integer chave = 1;

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chave++);
		empresa1.setNome("Alura");
		lista.add(empresa1);

		Empresa empresa2 = new Empresa();
		empresa2.setId(chave++);
		empresa2.setNome("ZUP");
		lista.add(empresa2);
	}

	public void insert(Empresa empresa) {
		empresa.setId(chave++);
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void delete(Integer id) {
		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empr = it.next();
			if (empr.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa findById(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
