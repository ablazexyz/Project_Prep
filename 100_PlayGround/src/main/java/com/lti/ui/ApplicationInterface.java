package com.lti.ui;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Application;
import com.lti.model.Customer_Details;

public class ApplicationInterface {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
	
		Customer_Details c1 = entityManager.find(Customer_Details.class, 28);
		
		Application appl = new Application("Jadavpur", 60000);
		appl.setCdetails2(c1);
		
		Application appl1 = new Application("Dum-Dum", 40000);
		appl1.setCdetails2(c1);
		
		
		c1.setApplications(new HashSet<Application>());
		c1.addApplications(appl);
		c1.addApplications(appl1);
		

		entityManager.getTransaction().begin();
		Customer_Details c2 = entityManager.merge(c1);
		entityManager.getTransaction().commit();

		
	}

}
