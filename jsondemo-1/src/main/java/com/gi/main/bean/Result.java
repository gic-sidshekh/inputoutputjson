package com.gi.main.bean;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Result {
	
	@JsonProperty("ComponentScoping")
	public ArrayList<ComponentScoping> componentScoping;
}
