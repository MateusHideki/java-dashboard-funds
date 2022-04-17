package com.dashboard.funds.model;

public class FundResponse extends FundRequest {

	private Double totalValue;

	public Double getTotalValue() {
		return this.totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "Fund [totalValue=" + totalValue + "]";
	}
	

}
