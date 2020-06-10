package com.luis.app.rest.quote.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.app.rest.quote.service.ConsumerService;

@RestController
@RequestMapping("/app")
public class QuoteController {
	
	private static final Logger log = LoggerFactory.getLogger(QuoteController.class);
	
	@Autowired
	ConsumerService consumerService;
	
	@GetMapping("/consumer")
	public void getRest() {
		consumerService.getConsumerRest();
	}
}
