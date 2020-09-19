package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DETAILS_TBL")
public class CustomerDetails {
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name = "AADHAAR_NUMBER")
	private long aadhaarNumber;
	
	@Column(name = "PAN")
	private long PAN;
	
	@Column(name = "MONTHLY_SALARY")
	private double monthlySalary;
	
	@Column(name = "RETIREMENT_AGE")
	private int retirementAge;
	
	@Column(name = "EMPLOYER_NAME")
	private String employerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private RegistrationDetails registrationDetails;
	
	
	public CustomerDetails() {
		super();
	}


	public CustomerDetails(int customerId, long aadhaarNumber, long pAN, double monthlySalary, int retirementAge,
			String employerName) {
		super();
		this.customerId = customerId;
		this.aadhaarNumber = aadhaarNumber;
		PAN = pAN;
		this.monthlySalary = monthlySalary;
		this.retirementAge = retirementAge;
		this.employerName = employerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public long getAadhaarNumber() {
		return aadhaarNumber;
	}


	public void setAadhaarNumber(long aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}


	public long getPAN() {
		return PAN;
	}


	public void setPAN(long pAN) {
		PAN = pAN;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	public int getRetirementAge() {
		return retirementAge;
	}


	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}


	public String getEmployerName() {
		return employerName;
	}


	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}


	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", aadhaarNumber=" + aadhaarNumber + ", PAN=" + PAN
				+ ", monthlySalary=" + monthlySalary + ", retirementAge=" + retirementAge + ", employerName="
				+ employerName + "]";
	}


	public RegistrationDetails getRegistrationDetails() {
		return registrationDetails;
	}


	public void setRegistrationDetails(RegistrationDetails registrationDetails) {
		this.registrationDetails = registrationDetails;
	}
	
	
	
	
}
