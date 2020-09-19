package com.lti.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TBL")
@SequenceGenerator(name="acc_seq", initialValue=100000001, allocationSize=100)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_seq")
	private int AccountNo;
	
	private double balance;
	
	private int cust_id;
	
	@OneToMany(mappedBy = "account" , cascade = CascadeType.ALL)
	private Set<Loan> loans;
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer_Details cdetails3;

	public Account() {
		super();
	}
	
	public void addLoan(Loan loan) {
		loans.add(loan);
	}
	
	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	
	
	
}
