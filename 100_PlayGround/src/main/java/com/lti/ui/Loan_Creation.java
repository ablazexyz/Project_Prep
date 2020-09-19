package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Application;
import com.lti.model.Loan;

public class Loan_Creation {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Application application = entityManager.find(Application.class, 29);
		Application application2 = entityManager.find(Application.class, 30);
		
		Loan l1 = new Loan();
		
		Loan l2 = new Loan();
		
		l1.setApplication(application);
		l2.setApplication(application2);
		
		entityManager.getTransaction().begin();
		entityManager.persist(l1);
		entityManager.persist(l2);
		entityManager.getTransaction().commit();
		
		System.out.println(l1.getApplication().getLoanAmt());
	}

}
