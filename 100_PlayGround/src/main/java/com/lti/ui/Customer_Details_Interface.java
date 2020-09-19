package com.lti.ui;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Application;
import com.lti.model.Customer_Details;
import com.lti.model.Registration;

public class Customer_Details_Interface {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();

		Application appl = new Application("Jadavpur",60000);
		Application appl1 = new Application("Dum-Dum",40000);
		
		Customer_Details c1 = entityManager.find(Customer_Details.class, 1);
		
		entityManager.getTransaction().begin();

		entityManager.remove(c1);

		entityManager.getTransaction().commit();

	}

}
