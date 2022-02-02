package com.gi.main.controller;

import java.util.ArrayList; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gi.main.bean.ComponentScoping;
import com.gi.main.bean.Input;
import com.gi.main.bean.Result;
import com.gi.main.bean.Root;
import com.gi.main.service.MetaDataService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class RootController {

	@Autowired
	 MetaDataService mdService;
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(RootController.class);
	ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	//Input input = new Input();
	
//		@PostMapping("/processed")
//		public Root inputJson(@RequestBody Root inp)	{
//			System.out.println(inp);
//			mdService.demofunc(inp);	
//			ArrayList<ComponentScoping> cs=inp.getData().get(0).getTaskSpecs().getComponentScoping();
//			Result rs = new Result();
//			rs.setComponentScoping(cs);
//			inp.getData().get(0).setResult(rs);
//			inp.getData().get(0).setTaskSpecs(null);
//			return inp;		
//			}
		
		@PostMapping(path="/save")
		public String saveJson(@RequestBody Root json)
		{
			mdService.demofunc(json);
			JsonNode root= null;
			try {
				String str= mapper.writeValueAsString(json);
			root= mapper.readValue(str, JsonNode.class);
			LOGGER.info("root:{}",root);
			}
			catch (Exception e) {
				// TODO: handle exception
				LOGGER.info("Exception occoured while converting root:{}",e.getMessage());
			}
			
			ArrayList<ComponentScoping> cs=json.getData().get(0).getTaskSpecs().getComponentScoping();
			Result rs = new Result();
			rs.setComponentScoping(cs);
			json.getData().get(0).setResult(rs);
			json.getData().get(0).setTaskSpecs(null);
			mdService.saveJson(root);
			return "saved";
		}

		@GetMapping(path= "/saved/{id}")
		public ResponseEntity<Input> getGicjsonById(@PathVariable Long id)
		{
			Input input = new Input();
			input = mdService.getJsonById(id);
			return ResponseEntity.ok(input);
		}
}
