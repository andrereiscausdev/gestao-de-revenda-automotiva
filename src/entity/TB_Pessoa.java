package entity;

import java.sql.Date;

public class TB_Pessoa {

	private long id;
	private String nome;
	private String cpf;
	private String CNH;
	private Date dataDeNascimento;
	private String nomeDeUsuario;

	public TB_Pessoa(long id, String nome, String cpf, String CNH, Date dataDeNascimento) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.CNH = CNH;
		this.dataDeNascimento = dataDeNascimento;

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCnh(String cnh) {
		this.CNH = cnh;
	}

	public String getCnh() {
		return this.CNH;
	}

	public void setdataDeNascimento(Date dataDeNascimento) {
		this.setdataDeNascimento(dataDeNascimento);
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setnomeDeUsuario(String nomeDeUsuario) {
		this.setnomeDeUsuario(nomeDeUsuario);
	}

	public String getnomeDeUsuario() {
		return nomeDeUsuario;
	}
}