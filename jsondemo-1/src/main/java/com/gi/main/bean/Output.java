package com.gi.main.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gi.main.bean.*;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {
	
	MetaData metadata;
	List<Datam>  data;
}
