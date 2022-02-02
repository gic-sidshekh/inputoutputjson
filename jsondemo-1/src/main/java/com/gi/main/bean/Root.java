package com.gi.main.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {

	public MetaData metadata;
    public ArrayList<Datam> data;
    
    Root()
    {
    	
    }
}
