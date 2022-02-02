package com.gi.main.bean;

import java.util.ArrayList; 

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class RuleResult {

	private ArrayList<String> result;
	private boolean success;
    private String message;
    private int status;
    
}
