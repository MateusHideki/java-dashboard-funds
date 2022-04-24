package com.dashboard.funds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.funds.model.Dividendo;
import com.dashboard.funds.model.FundRequest;
import com.dashboard.funds.model.FundResponse;
import com.dashboard.funds.services.FundService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	public List<Dividendo> getDiv10(@RequestHeader(value = "periodoEmAnos", required = false) Integer periodo) {
		return fundservice.fundDiv10(periodo * 12);
	}
}
