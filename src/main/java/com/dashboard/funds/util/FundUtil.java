package com.dashboard.funds.util;

import com.dashboard.funds.entity.Fund;
import com.dashboard.funds.model.FundResponse;

public class FundUtil {

	
	public static FundResponse transformFundToFundReponse(Fund fund) {
		FundResponse response = new FundResponse();
		response.setDividend(fund.getDividend());
		response.setDividendYield(fund.getDividendYield());
		response.setMax52weeks(fund.getMax52weeks());
		response.setMin52weeks(fund.getMin52weeks());
		response.setNameCompany(fund.getNameCompany());
		response.setQuant(fund.getQuant());
		response.setTicker(fund.getTicker());
		response.setUnitValue(fund.getUnitValue());
		response.setTotalValue(fund.getQuant() * fund.getUnitValue());
		
		return response;
	}
}
