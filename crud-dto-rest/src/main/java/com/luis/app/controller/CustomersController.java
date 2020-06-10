package com.luis.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luis.app.dto.CustomersDTO;
import com.luis.app.service.ICreateCustomersService;

@RestController
@RequestMapping("/app")
public class CustomersController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomersController.class);
	
	@Autowired
	ICreateCustomersService createCustomersService;
	
	@PostMapping("/create")
	public void creteCustomers(@RequestBody CustomersDTO request) {
		log.info(request.getNameCustomers());
		log.info(request.getLastName());
		log.info(request.getEmail());
		log.info("Address*******************************");
		
		log.info(request.getAddress().getStreet());
		log.info(String.valueOf(request.getAddress().getPostalCode()));
		log.info(request.getAddress().getReference());
		
		createCustomersService.createCustomers(request);
	}
}
