package com.luis.app.rest.quote.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.luis.app.rest.quote.dao.QuoteRepository;
import com.luis.app.rest.quote.dao.ValoresRepository;
import com.luis.app.rest.quote.entity.Quote;
import com.luis.app.rest.quote.entity.Value;

@Service
public class ConsumerServiceImpl implements ConsumerService{

	private static final Logger log = LoggerFactory.getLogger(ConsumerServiceImpl.class);
	
	@Autowired
	QuoteRepository quoteRepository;
	
	@Autowired
	ValoresRepository valoresRepository;

	@Override
	public void getConsumerRest() {
		
		RestTemplate restTemplate = new RestTemplate();
		Value valor = new Value();
		Quote quote = new Quote();
		
		ResponseEntity<Quote> response = restTemplate.getForEntity("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);
		
		quote.setType(response.getBody().getType());
		quoteRepository.save(quote);
		
		valor.setId(response.getBody().getValue().getId());
		valor.setQuote(response.getBody().getValue().getQuote());
		valoresRepository.save(valor);
	
	}

}
