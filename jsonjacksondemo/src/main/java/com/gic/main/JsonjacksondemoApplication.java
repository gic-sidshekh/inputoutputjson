package com.gic.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;


@SpringBootApplication
public class JsonjacksondemoApplication {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(JsonjacksondemoApplication.class, args);
		  
		  String str1 = "{\n" + 
		  		"  \"id\": 1,\n" + 
		  		"  \"firstName\": \"Krishna\",\n" + 
		  		"  \"lastName\": \"Gurram\",\n" + 
		  		"  \"age\": 31,\n" + 
		  		"  \"addresses\": [\n" + 
		  		"    {\n" + 
		  		"      \"city\": \"Bangalore\",\n" + 
		  		"      \"country\": \"India\",\n" + 
		  		"      \"street\": \"Chowdeswari street\"\n" + 
		  		"    },\n" + 
		  		"    {\n" + 
		  		"      \"city\": \"Hyderabad\",\n" + 
		  		"      \"country\": \"India\",\n" + 
		  		"      \"street\": \"Ramappa street\"\n" + 
		  		"    }\n" + 
		  		"  ]\n" + 
		  		"}";
		  
		  String str2 = "{\n" + 
		  		"  \"id\": 1,\n" + 
		  		"  \"firstName\": \"Ram\",\n" + 
		  		"  \"lastName\": \"Gurram\",\n" + 
		  		"  \"age\": 24,\n" + 
		  		"  \"addresses\": [\n" + 
		  		"    {\n" + 
		  		"      \"city\": \"Bangalore\",\n" + 
		  		"      \"country\": \"India\",\n" + 
		  		"      \"street\": \"Chowdeswari street\"\n" + 
		  		"    },\n" + 
		  		"    {\n" + 
		  		"      \"city\": \"Gudivada\",\n" + 
		  		"      \"country\": \"India\",\n" + 
		  		"      \"street\": \"PTR street\"\n" + 
		  		"    }\n" + 
		  		"  ]\n" + 
		  		"}\n" + 
		  		"";
		  
		  System.out.println(str1);
		  System.out.println(str2);
		  
		  ObjectMapper objm = new ObjectMapper();
		  TypeReference<HashMap<String, Object>> type = 
				    new TypeReference<HashMap<String, Object>>() {};

		  
			Map<String, Object> str1Map = objm.readValue(str1, type);
			Map<String, Object> str2Map = objm.readValue(str2, type);
			
			MapDifference<String, Object> difference = Maps.difference(str1Map, str2Map);
			printMapDifference(difference);
	}
	
	private static void printMapDifference(MapDifference<String, Object> difference) 
	{
		difference.entriesDiffering().forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
