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
import javax.persistence.Transient;

@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer_Details implements Serializable{
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	
	private int c_aadhar,c_sal;
	
	public Customer_Details() {
		super();
	}

	public Customer_Details( int c_aadhar, int c_sal) {
		super();
		this.c_aadhar = c_aadhar;
		this.c_sal = c_sal;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getC_aadhar() {
		return c_aadhar;
	}

	public void setC_aadhar(int c_aadhar) {
		this.c_aadhar = c_aadhar;
	}

	public int getC_sal() {
		return c_sal;
	}

	public void setC_sal(int c_sal) {
		this.c_sal = c_sal;
	}

	@Override
	public String toString() {
		return "Customer_Details [customer_id=" + customer_id + ", c_aadhar=" + c_aadhar + ", c_sal=" + c_sal + "]";
	}
	
	
	
}
