package com.dashboard.funds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fund")
public class Fund {

	@Id
	@Column(name = "ticker")
	private String ticker;

	@Column(name = "quant")
	private Integer quant;

	@Column(name = "unitValue")
	private Double unitValue;

	@Column(name = "nameCompany")
	private String nameCompany;

	@Column(name = "min52weeks")
	private Double min52weeks;

	@Column(name = "max52weeks")
	private Double max52weeks;

	@Column(name = "dividendYield")
	private Double dividendYield;

	@Column(name = "dividend")
	private Double dividend;
	
	
	public Double getDividend() {
		return dividend;
	}

	public void setDividend(Double dividend) {
		this.dividend = dividend;
	}

	public Integer getQuant() {
		return quant;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Double getMin52weeks() {
		return min52weeks;
	}

	public void setMin52weeks(Double min52weeks) {
		this.min52weeks = min52weeks;
	}

	public Double getMax52weeks() {
		return max52weeks;
	}

	public void setMax52weeks(Double max52weeks) {
		this.max52weeks = max52weeks;
	}

	public Double getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(Double dividendYield) {
		this.dividendYield = dividendYield;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(Double unitValue) {
		this.unitValue = unitValue;
	}
	
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	@Override
	public String toString() {
		return "FundRequest [ticker=" + ticker + ", quant=" + quant + ", unitValue=" + unitValue + ", nameCompany="
				+ nameCompany + ", min52weeks=" + min52weeks + ", max52weeks=" + max52weeks + ", dividendYield="
				+ dividendYield + "]";
	}

}
