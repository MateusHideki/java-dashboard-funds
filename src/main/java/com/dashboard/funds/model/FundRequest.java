package com.dashboard.funds.model;

public class FundRequest {

	private String ticker;
	private Double quant;
	private Double unitValue;
	private String nameCompany;
	private Double min52weeks;
	private Double max52weeks;
	private Double dividendYield;
	
	public Double getQuant() {
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

	public void setQuant(Double quant) {
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
