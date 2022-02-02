package com.gi.main.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CaseDetails {
	@JsonProperty("Type of Check")
	public String typeOfCheck;
	@JsonProperty("Package Name")
	public String packageName;
	@JsonProperty("Request Status")
	public String requestStatus;
	@JsonProperty("Contact Date")
	public String contactDate;
	@JsonProperty("Do you have a date when we can contact the current or most recent employer for this Candidate?")
	public String doYouHaveADateWhenWeCanContactTheCurrentOrMostRecentEmployerForThisCandidate;
	@JsonProperty("Case Origin")
	public String caseOrigin;
	@JsonProperty("Email To")
	public String emailTo;
	@JsonProperty("Candidate's First Name")
	public String candidateSFirstName;
	@JsonProperty("Official Email Address")
	public String officialEmailAddress;
	@JsonProperty("Start Date")
	public String startDate;
	@JsonProperty("SRT")
	public String sRT;
	@JsonProperty("Remarks")
	public String remarks;
	@JsonProperty("Client Name(Full Business name)")
	public String clientNameFullBusinessName;
	@JsonProperty("Subject Type")
	public String subjectType;
	@JsonProperty("Is Duplicate Case")
	public boolean isDuplicateCase;
	@JsonProperty("SBU")
	public String sBU;
	@JsonProperty("LOA Submitted")
	public String lOASubmitted;
	@JsonProperty("Personal Email Address")
	public String personalEmailAddress;
	@JsonProperty("Candidate's Last Name")
	public String candidateSLastName;
	@JsonProperty("Package Type")
	public String packageType;
	@JsonProperty("Subject Details to be Entered By")
	public String subjectDetailsToBeEnteredBy;
	@JsonProperty("Email Template")
	public String emailTemplate;
	@JsonProperty("Client Cost Code")
	public String clientCostCode;
	@JsonProperty("Client Reference #")
	public String clientReference;
	@JsonProperty("Candidate's Middle Name")
	public String candidateSMiddleName;
	@JsonProperty("Case Date")
	public String caseDate;
	@JsonProperty("Date of Birth")
	public String dateOfBirth;
	@JsonProperty("Do you grant FADV persmission for checks to be undertaken with the current or most recent employer now?")
	public String doYouGrantFADVPersmissionForChecksToBeUndertakenWithTheCurrentOrMostRecentEmployerNow;
	@JsonProperty("Candidate Auhorization Letter")
	public String candidateAuhorizationLetter;
}
