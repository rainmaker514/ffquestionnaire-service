package edu.fiu.ffqr.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Document(collection="questionnaires")
public class FFQuestionnaire implements Serializable {
	@Id
	@JsonProperty("id")
	private ObjectId id;
	@JsonProperty("questionnaireID")
	private String questionnaireID;
	@JsonProperty("patientName")
	private String patientName;
	@JsonProperty("issuerID")
	private String issuerID;
	@JsonProperty("date")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date date;
	@JsonProperty("submitted")
	private boolean submitted;
	
	public FFQuestionnaire () {}
	
	public FFQuestionnaire(String questionnaireID, String patientName, Date date, boolean submitted)
	{
		this.id = new ObjectId();
		this.questionnaireID = questionnaireID;
		this.patientName = patientName;
		this.date = date;
		this.submitted = submitted;
	}
	
	public FFQuestionnaire(String questionnaireID, String issuerID) 
	{
		this.id = new ObjectId();
		this.questionnaireID = questionnaireID;
		this.patientName = "";
		this.issuerID = issuerID;
		this.date = new Date();
		this.submitted = false;
	}

	public String getQuestionnaireID() {
		return questionnaireID;
	}
	
	public void setQuestionnaireID(String questionnaireID) {
		this.questionnaireID = questionnaireID;
	}
	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getIssuerID() {
		return issuerID;
	}

	public void setIssuerID(String issuerID) {
		this.issuerID = issuerID;
	}

	public boolean isSubmitted() {
		return submitted;
	}
	
	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}
	
	public ObjectId getId() { 
		return id;
	}
	  
	public void setId(ObjectId id) {
		this.id = id;
	}
}
