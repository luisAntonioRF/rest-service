package com.luis.app.rest.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luis.app.rest.app.consumer.EndPoint;
import com.luis.app.rest.app.entity.Pais;

@RestController
@RequestMapping("/app")
public class PaisController {

	@Autowired
	EndPoint endPoint;
	
	@GetMapping("/pais")
	public void getPais() throws JsonMappingException, JsonProcessingException {
		List<Pais> paises = endPoint.consumer();
		
		for (Pais pais : paises) {
			System.out.println(pais);
		}
	}
}
