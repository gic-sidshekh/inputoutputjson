package com.gi.main.service;

import java.util.List;  
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gi.main.bean.ComponentScoping;
import com.gi.main.bean.Components;
import com.gi.main.bean.Input;
import com.gi.main.bean.MultiEngineResults;
import com.gi.main.bean.Record;
import com.gi.main.bean.Root;
import com.gi.main.bean.TaskSpecs;
import com.gi.main.repository.MetaDataInt;

@Service
public class MetaDataService {

	@Autowired
	MetaDataInt metadataint;
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MetaDataService.class);
	ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	public void demofunc(Root inp) {
		
		Input input = new Input();
		List<TaskSpecs> ts = inp.getData().stream().map(m -> m.getTaskSpecs()).collect(Collectors.toList());
		for (TaskSpecs t : ts) 
		{
			for (ComponentScoping cs : t.getComponentScoping()) 
			{
				for (Components c : cs.getComponents())
				{
					for (Record rec : c.getRecords())
					{
						for( String s:rec.getRuleResult().getResult())                
						   if ("Include".equalsIgnoreCase(s)) {
							  rec.setMultiEngineResults(getmultiEngineResults());
							 System.out.println("got the reuslt as "+inp);
						  }
					}
				}
			
			}
	}
		}

	public MultiEngineResults getmultiEngineResults()	
	{
		MultiEngineResults multiengineResults = new MultiEngineResults();
			multiengineResults.setCbvutvi4vResult("");
		    multiengineResults.setSuspectResult("");
		    multiengineResults.setUniqueResult("");
		    multiengineResults.setWellknownResult("");
			return multiengineResults;		
	    }
	
	public Input saveJson(JsonNode input)
	{
		Input inp = new Input();
		inp.setData(input);
		//LOGGER.info("Input json in controller:{}",input);
		LOGGER.info("Input Json:{}",input);
		return metadataint.save(inp);
	}
	
	public Input getJsonById(Long id) 
	{
		Input input = metadataint.findById(id).orElseThrow(()-> new RuntimeException("Input not found with id "+id));
		return input;

	}
}