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
import javax.persistence.Table;

@Entity
@Table(name = "LOAN_TBL")
public class Loan {

	@Id
	@Column(name = "LOAN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LoanId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Application_Id")
	private Application application;

	@ManyToOne
	@JoinColumn(name = "Account_No")
	private Account account;
	
	public Loan() {
		super();
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public int getLoanId() {
		return LoanId;
	}

	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	
	
}
