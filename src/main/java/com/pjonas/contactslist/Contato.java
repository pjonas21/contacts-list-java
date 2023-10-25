package com.pjonas.contactslist;

public class Contato {
	
	private String id;
	private String nome;
	private String ddd;
	private String telefone;
	
	public Contato() {}
	
	public Contato(String id, String nome, String ddd, String telefone) {
		this.id = id;
		this.nome = nome;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public boolean isNovo() {
		return id == null;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", ddd=" + ddd + ", telefone=" + telefone + "]";
	}
	
	
	
	

}
