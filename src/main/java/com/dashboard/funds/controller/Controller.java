package com.dashboard.funds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.funds.model.FundRequest;
import com.dashboard.funds.model.FundResponse;
import com.dashboard.funds.services.FundService;

@RestController
public class Controller {
	
	@Autowired
	private FundService fundservice;
	
	@GetMapping(value = "/pegaFundo")
	public FundResponse getFund() {
		return fundservice.fundGet();
	}
	
	@PostMapping(value = "/fund")
	public FundResponse fundRegistration(@RequestBody FundRequest fund) {
		return fundservice.fundPost(fund);
	}
	
	@GetMapping(value = "/dividendo10")
	public FundResponse getDiv10() {
		return fundservice.fundDiv10();
	}
}
