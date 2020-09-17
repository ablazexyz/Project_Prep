package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATION_TBL")
public class Registration implements Serializable{
	
	@Id
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	private String cname,cpass;
	
	private int cnumber;

	public Registration() {
		super();
	}
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer_Details cdetails;

	public Registration(String emailId, String cname, String cpass, int cnumber) {
		super();
		this.emailId = emailId;
		this.cname = cname;
		this.cpass = cpass;
		this.cnumber = cnumber;
	}



	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

	public Customer_Details getCdetails() {
		return cdetails;
	}



	public void setCdetails(Customer_Details cdetails) {
		this.cdetails = cdetails;
	}
	
	

	
	
	@Override
	public String toString() {
		return "Registration [emailId=" + emailId + ", cname=" + cname + ", cpass=" + cpass + ", cnumber=" + cnumber;
	}




	
}
