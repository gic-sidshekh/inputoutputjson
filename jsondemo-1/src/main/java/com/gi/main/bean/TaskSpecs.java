package com.gi.main.bean;

import java.util.ArrayList; 
import java.util.List;

import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskSpecs {
	
	@JsonProperty("ComponentScoping") 
    public ArrayList<ComponentScoping> componentScoping;
	
	public TaskSpecs() {
		// TODO Auto-generated constructor stub
	}
	
}
