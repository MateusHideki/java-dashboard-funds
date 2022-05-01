package com.dashboard.funds.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.funds.entity.Help;
import com.dashboard.funds.model.Dividendo;
import com.dashboard.funds.model.FundRequest;
import com.dashboard.funds.model.FundResponse;
import com.dashboard.funds.repository.FundRepository;
import com.dashboard.funds.repository.HelpRepository;
import com.dashboard.funds.services.FundService;
import com.dashboard.funds.util.FundUtil;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
	
	@Autowired
	private FundService fundservice;
	
	@Autowired(required = true)
	private HelpRepository help;
	
	@Autowired
	private FundRepository fundRespository;
	
	
	@GetMapping(value = "/pegaFundo")
	public FundResponse getFund(@RequestHeader(value = "ticker") String ticker) {
		FundResponse fundoInic = FundUtil.transformFundToFundReponse(fundRespository.findByTicker(ticker));
		return fundoInic;
	}
	
	@PostMapping(value = "/fund")
	public FundResponse fundRegistration(@RequestBody FundRequest fund) {
		return fundservice.fundPost(fund);
	}
	
	@GetMapping(value = "/dividendo10")
	public List<Dividendo> getDiv10(@RequestHeader(value = "periodoEmAnos", required = false) Integer periodo) {
		return fundservice.fundDiv10(periodo * 12);
	}
	
	@GetMapping(value = "/testedb")
	public ArrayList<Help> teste123() {
	
		ArrayList<Help> response = help.findByTOPICAndSEQ("@", 321D);
		
		return response;
	}
}
