package com.dashboard.funds.model;

public class Dividendo {
	private Integer quantMesAtual;
	private Double dividendoMesAtual;
	private Double sobra;
	private Integer quantComprada;
	private Integer MesAtual;
	public Dividendo(Integer quantMesAtual, Double dividendoMesAtual, Double sobra, Integer quantComprada,
			Integer mesAtual) {
		super();
		this.quantMesAtual = quantMesAtual;
		this.dividendoMesAtual = dividendoMesAtual;
		this.sobra = sobra;
		this.quantComprada = quantComprada;
		MesAtual = mesAtual;
	}
	public Integer getQuantMesAtual() {
		return quantMesAtual;
	}
	public void setQuantMesAtual(Integer quantMesAtual) {
		this.quantMesAtual = quantMesAtual;
	}
	public Double getDividendoMesAtual() {
		return dividendoMesAtual;
	}
	public void setDividendoMesAtual(Double dividendoMesAtual) {
		this.dividendoMesAtual = dividendoMesAtual;
	}
	public Double getSobra() {
		return sobra;
	}
	public void setSobra(Double sobra) {
		this.sobra = sobra;
	}
	public Integer getQuantComprada() {
		return quantComprada;
	}
	public void setQuantComprada(Integer quantComprada) {
		this.quantComprada = quantComprada;
	}
	public Integer getMesAtual() {
		return MesAtual;
	}
	public void setMesAtual(Integer mesAtual) {
		MesAtual = mesAtual;
	}
	
	
	
	
}
