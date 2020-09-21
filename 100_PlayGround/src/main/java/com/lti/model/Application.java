package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "APPLICATION_TBL")
public class Application {
	
	@Id
	@Column(name = "APPLICATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;

	private String propertyLocation;
	
	private double loanAmt;

	@ManyToOne
	@JoinColumn(name = "Customer_ID")
	private Customer_Details cdetails2;
	
	@OneToOne(mappedBy = "application", cascade = CascadeType.ALL)
	private Loan loan;
	
	public Application() {
		super();
	}

	public Application( String propertyLocation, double loanAmt) {
		super();
		this.propertyLocation = propertyLocation;
		this.loanAmt = loanAmt;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	
	public Customer_Details getCdetails2() {
		return cdetails2;
	}

	public void setCdetails2(Customer_Details cdetails2) {
		this.cdetails2 = cdetails2;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", propertyLocation=" + propertyLocation + ", loanAmt="
				+ loanAmt + "]";
	}
	
	
	
}
