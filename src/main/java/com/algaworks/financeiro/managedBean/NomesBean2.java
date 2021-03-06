package com.algaworks.financeiro.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ApplicationScoped
public class NomesBean2 {

	private String nome;

	private List<String> nomes = new ArrayList<>();

	public String adicionar() {
		this.nomes.add(nome);

		if (this.nomes.size() > 3) {
			return "Ola";
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

}
