package com.costa.domain;

public class Config {
	private Integer id;
	private String version;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Config(Integer id, String version) {
		super();
		this.id = id;
		this.version = version;
	}
	public Config() {
		super();
	}
	
	
	

}
