package com.costa.domain;

public class Permissao {
	private Integer id;
	private String descricao;
	private Classepermissao classepermissao;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Classepermissao getClassepermissao() {
		return classepermissao;
	}
	public void setClassepermissao(Classepermissao classepermissao) {
		this.classepermissao = classepermissao;
	}
	public Permissao(Integer id, String descricao, Classepermissao classepermissao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.classepermissao = classepermissao;
	}
	public Permissao() {
		super();
	}

}
