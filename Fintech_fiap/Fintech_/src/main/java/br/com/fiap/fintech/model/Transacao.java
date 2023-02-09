package br.com.fiap.fintech.model;

public class Transacao {

	private long codigo;
	private String tipo;
	private String valor;
	private String dttransacao;

	public Transacao(long codigo, String tipo, String valor, String dttransacao) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.valor = valor;
		this.dttransacao = dttransacao;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setCodigo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDtTransacao() {
		return dttransacao;
	}

	public void setDtTransacao(String dttransacao) {
		this.dttransacao = dttransacao;
	}
}
