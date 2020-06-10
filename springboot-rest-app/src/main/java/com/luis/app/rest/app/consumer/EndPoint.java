package com.luis.app.rest.app.consumer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.luis.app.rest.app.entity.Languages;
import com.luis.app.rest.app.entity.Pais;

@Component
public class EndPoint {
	
	private static final Logger log = LoggerFactory.getLogger(EndPoint.class);
	
	private String url = "https://restcountries.eu/rest/v2/all";
	
	public List<Pais> consumer() throws JsonMappingException, JsonProcessingException {
		RestTemplate rest = new RestTemplate();
		String response = rest.getForObject(url, String.class);
		ObjectMapper maper = new ObjectMapper();
		List<Pais> paisesList = new ArrayList<Pais>();
		Pais pais = null;
		
		ArrayNode nodeJson;
		
		nodeJson = (ArrayNode) maper.readTree(response);
		
		for (int i = 0; i < nodeJson.size(); i++) {
			pais= new Pais();
			pais.setName(nodeJson.get(i).get("name").asText());
			pais.setCapital(nodeJson.get(i).get("capital").asText());
			pais.setPopulation(nodeJson.get(i).get("population").asInt());
			pais.setFlag(nodeJson.get(i).get("flag").asText());
			pais.setLanguages(getListLanguaje(nodeJson,i));
			paisesList.add(pais);
		}
		
		return paisesList;
	}
	
	public List<Languages> getListLanguaje(ArrayNode nodeJson,int i){
		Languages lenguaje = null;
		List<Languages> lenguajeList = new ArrayList<>();
		
					for (int j = 0; j < nodeJson.size(); j++) {
						
						lenguaje= new Languages();
						
						if(nodeJson.get(i).get("languages").get(j) == null) {
							break;
						}
						
						lenguaje.setIso1(nodeJson.get(i).get("languages").get(j).get("iso639_1").asText());
						lenguaje.setIso2(nodeJson.get(i).get("languages").get(j).get("iso639_2").asText());
						lenguaje.setName(nodeJson.get(i).get("languages").get(j).get("name").asText());
						lenguaje.setNativeName(nodeJson.get(i).get("languages").get(j).get("nativeName").asText());
						lenguajeList.add(lenguaje);
									
					}
					
					return lenguajeList;
	}
	
}
