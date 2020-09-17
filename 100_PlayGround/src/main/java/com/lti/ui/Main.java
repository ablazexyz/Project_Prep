package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Registration;
import com.lti.model.Customer_Details;

public class Main {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
	
		Registration reg = new Registration("aba@gmail.com","AB","abc123",9876);
		//Customer_Details cdetails = new Customer_Details(1234567,5000);
		
		
		//this is setting up the relationship
		//reg.setCdetails(cdetails);
		
		entityManager.getTransaction().begin();
		//entityManager.persist(cdetails);
		entityManager.persist(reg);
		entityManager.getTransaction().commit();
		
		
	}

}
