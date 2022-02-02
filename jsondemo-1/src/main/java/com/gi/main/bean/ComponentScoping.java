package com.gi.main.bean;

import java.util.ArrayList;  

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ComponentScoping {
	@JsonProperty("SBU_NAME")
	public String sBU_NAME;
	@JsonProperty("CRNCreationDate")
	public String cRNCreationDate;
	@JsonProperty("Package Name")
	public String packageName;
	public CaseReference caseReference;
	@JsonProperty("CASE_NUMBER")
	public String cASE_NUMBER;
	@JsonProperty("CLIENT_NAME")
	public String cLIENT_NAME;
	public ClientSpecificFields clientSpecificFields;
	@JsonProperty("Components")
	public ArrayList<Components> components;
	@JsonProperty("CASE_UUID")
	public String cASE_UUID;
	@JsonProperty("Candidate_Name")
	public String candidate_Name;
	@JsonProperty("CLIENT_CODE")
	public String cLIENT_CODE;
	public CaseDetails caseDetails;
	@JsonProperty("CASE_REF_NUMBER")
	public String cASE_REF_NUMBER;
	@JsonProperty("TYPE")
	public String tYPE;
	@JsonProperty("BaseEJCCountryList")
	public Object baseEJCCountryList;
}