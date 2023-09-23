package com.healthcare.authenticationservice.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

public class PatientDetails {
	
	private String patientUsername;
	private String password;
    private String reason;
    private LocalDate date;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;
	public String getPatientUsername() {
		return patientUsername;
	}
	public void setPatientUsername(String patientUsername) {
		this.patientUsername = patientUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public PatientDetails(String patientUsername, String password, String reason, LocalDate date, LocalTime startTime,
			LocalTime endTime) {
		super();
		this.patientUsername = patientUsername;
		this.password = password;
		this.reason = reason;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
