package com.dashboard.funds.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dashboard.funds.model.Dividendo;
import com.dashboard.funds.model.FundRequest;
import com.dashboard.funds.model.FundResponse;
import com.dashboard.funds.repository.Repository;

@Component
public class FundService {

	@Autowired
	private Repository repository ;
	
	public FundResponse fundGet() {
		return repository.getFund();
	}
	

	public List<Dividendo> fundDiv10(Integer periodo) {
		repository.criaFundo();
		FundResponse fundoInic = repository.getFund();
		List<Dividendo> lista = new ArrayList<>();
		Double dividendoMesAtual = 0d;
		BigDecimal a = new BigDecimal(0);
		Integer quantMesAtual = fundoInic.getQuant();
		Double sobra = 0d;
		Integer quantComprada = 0;

		for(Integer i = 0; i < periodo; i++) {
			dividendoMesAtual = quantMesAtual * fundoInic.getDividend();
			sobra += dividendoMesAtual % fundoInic.getUnitValue();
			quantComprada = (int) (dividendoMesAtual / fundoInic.getUnitValue());
			if (sobra > fundoInic.getUnitValue()) {
				quantComprada++;
				sobra -= fundoInic.getUnitValue();
			}
			
			quantMesAtual = quantComprada + quantMesAtual;
			lista.add(new Dividendo(quantMesAtual, dividendoMesAtual, sobra, quantComprada, i));
		}
//		fundoInic.setTotalValue(fundoInic.getUnitValue() * quantMesAtual);
		return lista;
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
		
		repository.salveFund(response);
		
		return response;
	}
}
