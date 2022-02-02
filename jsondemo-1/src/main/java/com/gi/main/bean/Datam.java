package com.gi.main.bean;

 

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Datam 
{
	public String taskName;
	public String taskId;
	public String taskBy;
	public int taskSerialNo;
	@JsonInclude(value = Include.NON_NULL)
	public TaskSpecs taskSpecs;
	@JsonInclude(value = Include.NON_NULL)
	public Result result;
    

}
