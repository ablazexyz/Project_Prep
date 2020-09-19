package com.lti.ui;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Account;
import com.lti.model.Loan;

public class Account_Creation {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();

		Loan loan1 = entityManager.find(Loan.class, 38);

		Account ac1 = new Account();

		ac1.setBalance(loan1.getApplication().getLoanAmt());
		ac1.setCust_id(loan1.getApplication().getCdetails2().getCustomer_id());
		ac1.setLoans(new HashSet<Loan>());
		ac1.addLoan(loan1);

		entityManager.getTransaction().begin();
		entityManager.persist(ac1);
		entityManager.getTransaction().commit();
		
		
		Loan loan2 = entityManager.find(Loan.class, 39);

		List<Integer> cid_list = entityManager.createQuery("SELECT a.c_details3.customer_id FROM Account a").getResultList();

		if (cid_list.contains(28)) {

			ac1 = (Account) entityManager.createQuery("SELECT a FROM Account a WHERE a.cust_id = 28").getSingleResult();
			double balance = ac1.getBalance();
			balance += (loan2.getApplication().getLoanAmt());
			ac1.setBalance(balance);
			entityManager.getTransaction().begin();
			entityManager.merge(ac1);
			entityManager.getTransaction().commit();
		}
	}
}
