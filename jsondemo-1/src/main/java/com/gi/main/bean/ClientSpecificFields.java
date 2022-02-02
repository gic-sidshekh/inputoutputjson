package com.gi.main.bean;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClientSpecificFields {
	@JsonProperty("Client POC")
	public String clientPOC;
	@JsonProperty("I verify - Client portal case or offline case")
	public String iVerifyClientPortalCaseOrOfflineCase;
	@JsonProperty("HCL case date")
	public String hCLCaseDate;
	@JsonProperty("CTS request ID")
	public String cTSRequestID;
	@JsonProperty("Project ID")
	public String projectID;
	@JsonProperty("Employee ID")
	public String employeeID;
	@JsonProperty("CTS Associate ID")
	public String cTSAssociateID;
	@JsonProperty("HiringManagerName")
	public String hiringManagerName;
	@JsonProperty("PO Number")
	public String pONumber;
	@JsonProperty("Account Name")
	public String accountName;
	@JsonProperty("Department")
	public String department;
	@JsonProperty("Requestor Name")
	public String requestorName;
	@JsonProperty("Cost Centre")
	public String costCentre;
	@JsonProperty("Date of joining")
	public String dateOfJoining;
	@JsonProperty("Division")
	public String division;
	@JsonProperty("Identity Document")
	public String identityDocument;
	@JsonProperty("Date of Request")
	public String dateOfRequest;
	@JsonProperty("BGV ID-Pre/Post/Existing")
	public String bGVIDPrePostExisting;
	@JsonProperty("Candidate Identification Number")
	public String candidateIdentificationNumber;
	@JsonProperty("JRNumber")
	public String jRNumber;
	@JsonProperty("Position")
	public String position;
	@JsonProperty("Candidate ID")
	public String candidateID;
	public String requestoremail;
	@JsonProperty("Request ID")
	public String requestID;
	@JsonProperty("Tennessee Stopped date")
	public String tennesseeStoppedDate;
	@JsonProperty("Project Name")
	public String projectName;
	@JsonProperty("Hiring Country")
	public String hiringCountry;
	@JsonProperty("SR No")
	public String sRNo;
	@JsonProperty("Date of Re-initiation")
	public String dateOfReInitiation;
	@JsonProperty("Initiator Name")
	public String initiatorName;
}
