package com.costa.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class AtendimentoItens {
	private Exame exame;
	private Integer codigo;
	private Convenio convenio;
	private Atendimento atendimento;
	private OffsetDateTime data_atendimento;
	private Boolean status;
	private BigDecimal preco;
	private Tenant tenant;
	private BigDecimal desconto;
	private BigDecimal total;
	private Boolean acesso;
	public Exame getExame() {
		return exame;
	}
	public void setExame(Exame exame) {
		this.exame = exame;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Convenio getConvenio() {
		return convenio;
	}
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	public Atendimento getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	public OffsetDateTime getData_atendimento() {
		return data_atendimento;
	}
	public void setData_atendimento(OffsetDateTime data_atendimento) {
		this.data_atendimento = data_atendimento;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Boolean getAcesso() {
		return acesso;
	}
	public void setAcesso(Boolean acesso) {
		this.acesso = acesso;
	}
	public AtendimentoItens(Exame exame, Integer codigo, Convenio convenio, Atendimento atendimento,
			OffsetDateTime data_atendimento, Boolean status, BigDecimal preco, Tenant tenant, BigDecimal desconto,
			BigDecimal total, Boolean acesso) {
		super();
		this.exame = exame;
		this.codigo = codigo;
		this.convenio = convenio;
		this.atendimento = atendimento;
		this.data_atendimento = data_atendimento;
		this.status = status;
		this.preco = preco;
		this.tenant = tenant;
		this.desconto = desconto;
		this.total = total;
		this.acesso = acesso;
	}
	public AtendimentoItens() {
		super();
	}
	
	
	

}
