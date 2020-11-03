package Exemplos;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private String nome;
	private String eMail;
	private String telefone;
	private String cpf;
	
	public Pessoa(String nome, String eMail, String telefone, String cpf) {
		this.nome = nome;
		this.eMail = eMail;
		this.telefone = telefone;
		this.cpf = cpf;
	}	
	
	public String getNome() {
		return nome;
	}
	public String geteMail() {
		return eMail;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCpf() {
		return cpf;
	}
	
}
