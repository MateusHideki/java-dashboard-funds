package com.dashboard.funds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dashboard.funds.model.FundRequest;
import com.dashboard.funds.model.FundResponse;
import com.dashboard.funds.repository.Repository;

@Component
public class FundService {

	@Autowired
	private Repository respository ;
	
	public FundResponse fundGet() {
		return respository.getFund();
	}

	public FundResponse fundDiv10() {
		FundResponse fundoInic = respository.getFund();
		Double dividendoMesAtual = 0d;
		Integer quantMesAtual = fundoInic.getQuant();
		Double sobra = 0d;
		Integer quantComprada = 0;
		
		for(int i = 0; i < 5; i++) {
			dividendoMesAtual = quantMesAtual * fundoInic.getDividend();
			sobra += dividendoMesAtual % fundoInic.getUnitValue();
			quantComprada = (int) (dividendoMesAtual / fundoInic.getUnitValue());
			if (sobra > fundoInic.getUnitValue()) {
				quantComprada++;
				sobra -= fundoInic.getUnitValue();
			}
			
			quantMesAtual = quantComprada + quantMesAtual;

		}
		fundoInic.setTotalValue(fundoInic.getUnitValue() * quantMesAtual);
		return fundoInic;
	}
	
	public FundResponse fundPost(FundRequest request) {
		FundResponse response = new FundResponse();

		response.setQuant(request.getQuant());
		response.setUnitValue(request.getUnitValue());
		response.setNameCompany(request.getNameCompany());
		response.setTotalValue(request.getUnitValue() * request.getQuant());
		response.setDividendYield(request.getDividendYield());
		response.setMax52weeks(request.getMax52weeks());
		response.setMin52weeks(request.getMin52weeks());
		response.setTicker(request.getTicker());
		response.setDividend(request.getDividend());
		
		respository.salveFund(response);
		
		return response;
	}
}
