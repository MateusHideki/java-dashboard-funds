package com.dashboard.funds.repository;

import org.springframework.stereotype.Component;

import com.dashboard.funds.model.FundResponse;

@Component
public class Repository {
	
	public static FundResponse fund = new FundResponse();

	public static void salveFund(FundResponse response) {
		fund = response;
	}
	
	public static FundResponse getFund() {
		return fund;
	}

	public static void setFund(FundResponse fund) {
		Repository.fund = fund;
	}
}
