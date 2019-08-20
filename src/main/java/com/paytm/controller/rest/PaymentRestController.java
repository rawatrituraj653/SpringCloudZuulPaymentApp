package com.paytm.controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentRestController {

	@Value("${server.port}")
	private String port; 
	
	
	@GetMapping("/info")
	public String  showDeatils() {
		
		return "Payment with app:  "+port;
	}
	
}
