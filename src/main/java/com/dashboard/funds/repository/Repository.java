package com.dashboard.funds.repository;

import org.springframework.stereotype.Component;

import com.dashboard.funds.model.FundResponse;
import com.google.gson.Gson;

@Component
public class Repository {
	
	public static FundResponse fund = new FundResponse();

	public static void salveFund(FundResponse response) {
		fund = response;
	}
	
	public FundResponse getFund() {
		return fund;
	}

	public static void setFund(FundResponse fund) {
		Repository.fund = fund;
	}
	
	public void criaFundo() {
		
//		String json = "{\r\n"
//				+ "	\"ticker\": \"IRDM11\",\r\n"
//				+ "	\"quant\": 110,\r\n"
//				+ "	\"unitValue\": 108.11, \r\n"
//				+ "	\"nameCompany\": \"IRIDIUM RECEBÍVEIS IMOBILIÁRIOS\",\r\n"
//				+ "	\"min52weeks\": 101.00,\r\n"
//				+ "	\"max52weeks\": 141.35,\r\n"
//				+ "	\"dividendYield\": 12.86,\r\n"
//				+ "	\"dividend\": 1.18\r\n"
//				+ "}";
//		FundResponse convertedObject =new Gson().fromJson(json, FundResponse.class);
//		fund = convertedObject;
		fund.setDividend(1.18);
		fund.setDividendYield(12.86);
		fund.setMax52weeks(141.35);
		fund.setMin52weeks(101.00);
		fund.setNameCompany("IRIDIUM RECEBÍVEIS IMOBILIÁRIOS");
		fund.setTicker("IRDM11");
		fund.setUnitValue(108.11);
		fund.setQuant(110);
	}
}
