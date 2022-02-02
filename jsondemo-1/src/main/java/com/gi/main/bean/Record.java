package com.gi.main.bean;

import java.util.ArrayList; 
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {

	@JsonProperty("Candidate name")
	public String candidateName;
	@JsonProperty("Personal Mobile No ")
	public String personalMobileNo;
	@JsonProperty("Identification Submitted")
	public String identificationSubmitted;
	@JsonProperty("First Name")
	public String firstName;
	@JsonProperty("Middle Name")
	public String middleName;
	@JsonProperty("Gender")
	public String gender;
	@JsonProperty("Doc Identification No")
	public String docIdentificationNo;
	@JsonProperty("Marital Status")
	public String maritalStatus;
	@JsonProperty("Nationality")
	public String nationality;
	public ArrayList<DocumentSource> documentSource;
	@JsonProperty("Home phone")
	public String homePhone;
	@JsonProperty("DOB")
	public String dOB;
	@JsonProperty("Is the document clear?")
	public String isTheDocumentClear;
	@JsonProperty("Professional Email ID")
	public String professionalEmailID;
	@JsonProperty("Personal Email ID")
	public String personalEmailID;
	@JsonProperty("INSTRUCTION_CHECK_ID")
	public int iNSTRUCTION_CHECK_ID;
	public RuleResult ruleResult;
	@JsonProperty("FathersName")
	public String fatherName;
	@JsonProperty("Last Name")
	public String lastName;
	@JsonProperty("Aka Name")
	public String akaName;
	@JsonProperty("Completed/Pursuing")
	public String completedPursuing;
	@JsonProperty("University Location (State)")
	public String universityLocationState;
	@JsonProperty("Period of Study (To)")
	public String periodOfStudyTo;
	@JsonProperty("University City")
	public String universityCity;
	@JsonProperty("University(Country)")
	public String universityCountry;
	@JsonProperty("College Name")
	public String collegeName;
	@JsonProperty("Unique Number")
	public String uniqueNumber;
	@JsonProperty("Result")
	public String result;
	@JsonProperty("Year of Passing")
	public String yearOfPassing;
	@JsonProperty("Specialization")
	public String specialization;
	@JsonProperty("Regular or Correspondence")
	public String regularOrCorrespondence;
	@JsonProperty("University Name")
	public String universityName;
	@JsonProperty("College/Centre Name Aka Name")
	public String collegeCentreNameAkaName;
	@JsonProperty("Part time or full time")
	public String partTimeOrFullTime;
	@JsonProperty("College(Country)")
	public String collegeCountry;
	@JsonProperty("College City")
	public String collegeCity;
	@JsonProperty("Qualification/course name")
	public String qualificationCourseName;
	@JsonProperty("Period of Study (From)")
	public String periodOfStudyFrom;
	@JsonProperty("Qualification level")
	public String qualificationLevel;
	@JsonProperty("Grade/Class")
	public String gradeClass;
	@JsonProperty("University Aka Name")
	public String universityAkaName;
	@JsonProperty("Document issued Date")
	public String documentIssuedDate;
	@JsonProperty("Is this Professional Education")
	public String isThisProfessionalEducation;
	@JsonProperty("College Location (State)")
	public String collegeLocationState;
	@JsonProperty("Month of Passing")
	public String monthOfPassing;
	@JsonProperty("Unique Number Type")
	public String uniqueNumberType;
	@JsonProperty("Entity Specific Type")
	public String entitySpecificType;
	@JsonProperty("Supervisor's Email ID")
	public String supervisorSEmailID;
	@JsonProperty("Company Aka Name")
	public String companyAkaName;
	@JsonProperty("Employee ID")
	public String employeeID;
	@JsonProperty("Third Party or Agency Name and Address")
	public String thirdPartyOrAgencyNameAndAddress;
	@JsonProperty("Department")
	public String department;
	@JsonProperty("Date to be contacted")
	public String dateToBeContacted;
	@JsonProperty("Third Party Company")
	public String thirdPartyCompany;
	@JsonProperty("Third party Company(city)")
	public String thirdPartyCompanyCity;
	@JsonProperty("HR Name")
	public String hRName;
	@JsonProperty("Employment Type")
	public String employmentType;
	@JsonProperty("Date Of Exit (Till Date)")
	public String dateOfExitTillDate;
	@JsonProperty("Date of joining")
	public String dateOfJoining;
	@JsonProperty("Entity Specific ID")
	public String entitySpecificID;
	@JsonProperty("Reason for Leaving")
	public String reasonForLeaving;
	@JsonProperty("Supervisor Name")
	public String supervisorName;
	@JsonProperty("Supervisor's Contact No")
	public String supervisorSContactNo;
	@JsonProperty("Company Contact No")
	public String companyContactNo;
	@JsonProperty("Date of Exit")
	public String dateOfExit;
	@JsonProperty("Supervisor Designation")
	public String supervisorDesignation;
	@JsonProperty("Self employment/Family business")
	public String selfEmploymentFamilyBusiness;
	@JsonProperty("Designation")
	public String designation;
	@JsonProperty("Reason For Gap")
	public String reasonForGap;
	@JsonProperty("Can CE be contacted")
	public String canCEBeContacted;
	@JsonProperty("HR Contact No")
	public String hRContactNo;
	@JsonProperty("Is this Previous Employment linked to Current Employment")
	public String isThisPreviousEmploymentLinkedToCurrentEmployment;
	@JsonProperty("City")
	public String city;
	@JsonProperty("Remuneration")
	public String remuneration;
	@JsonProperty("Is this your Current Employment (CE)")
	public String isThisYourCurrentEmploymentCE;
	@JsonProperty("Location Where the Candidate was deployed/Location Where the Candidate Worked")
	public String locationWhereTheCandidateWasDeployedLocationWhereTheCandidateWorked;
	@JsonProperty("Third party Company(Country)")
	public String thirdPartyCompanyCountry;
	@JsonProperty("Company Name")
	public String companyName;
	@JsonProperty("HR email ID")
	public String hREmailID;
	@JsonProperty("State")
	public String state;
	@JsonProperty("Complete Company Address with Landmark")
	public String completeCompanyAddressWithLandmark;
	@JsonProperty("Country")
	public String country;
	@JsonProperty("Third party Company(state)")
	public String thirdPartyCompanyState;
	@JsonProperty("Nature of Employment")
	public String natureOfEmployment;
	@JsonProperty("Service Type")
	public String serviceType;
	@JsonProperty("MultiEngineResults")
	public MultiEngineResults multiEngineResults;
    
}
