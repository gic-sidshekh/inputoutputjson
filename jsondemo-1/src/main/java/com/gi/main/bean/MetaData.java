package com.gi.main.bean;

import java.util.Date; 

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MetaData {
	
	public String processName;
    public String processId;
    public String stageId;
    public String task;
    public String taskGroupId;
    public Date requestDate;
    public String requestId;
    public String version;
    public int attempt;
    public String multiTask;
    public String requestAuthToken;
    public String txLabel;

}
