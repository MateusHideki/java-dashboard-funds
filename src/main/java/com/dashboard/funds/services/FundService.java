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
		
		respository.salveFund(response);
		
		return response;
	}
}
