package br.com.caelum.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	public static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}