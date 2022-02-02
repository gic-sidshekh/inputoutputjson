package com.gi.main.bean;

import java.util.ArrayList; 

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Components {

	@JsonProperty("CANDIDATE_DE_COMPLETED_DT")
	public String cANDIDATE_DE_COMPLETED_DT;
	@JsonProperty("PRODUCT")
	public String pRODUCT;
	@JsonProperty("Component name")
	public String componentName;
	public boolean dbComponent;
	@JsonProperty("Records")
	public ArrayList<Record> records; 
    
}
