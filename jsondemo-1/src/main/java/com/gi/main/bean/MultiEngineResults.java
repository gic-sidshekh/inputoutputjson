package com.gi.main.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultiEngineResults {

	 public String suspectResult;
	 public String cbvutvi4vResult;
	 public String wellknownResult;
	 public String uniqueResult;
	 
}
