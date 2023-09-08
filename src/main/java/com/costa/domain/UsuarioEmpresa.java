package com.costa.domain;

public class UsuarioEmpresa {
	private Integer id_usuario;
	private Integer id_empresa;
	private String empresapadrao;
	private Tenant tenant;
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Integer getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getEmpresapadrao() {
		return empresapadrao;
	}
	public void setEmpresapadrao(String empresapadrao) {
		this.empresapadrao = empresapadrao;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public UsuarioEmpresa(Integer id_usuario, Integer id_empresa, String empresapadrao, Tenant tenant) {
		super();
		this.id_usuario = id_usuario;
		this.id_empresa = id_empresa;
		this.empresapadrao = empresapadrao;
		this.tenant = tenant;
	}
	public UsuarioEmpresa() {
		super();
	}
	
}
