package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Customer_Details;
import com.lti.model.Registration;

public class Customer_Details_Interface {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		Customer_Details c1 = new Customer_Details(1234567,5000);
		Customer_Details c2 = new Customer_Details(2345678,4500);
		Customer_Details c3 = new Customer_Details(3456789,3500);
		
		Registration reg = entityManager.find(Registration.class, "aba@gmail.com");
		Registration reg2 = entityManager.find(Registration.class, "abc@gmail.com");
		Registration reg3 = entityManager.find(Registration.class, "xyz@gmail.com");
		
		reg.setCdetails(c1);
		reg2.setCdetails(c2);
		reg3.setCdetails(c3);
		
		entityManager.getTransaction().begin();

		entityManager.persist(reg);
		entityManager.persist(reg2);
		entityManager.persist(reg3);

		entityManager.getTransaction().commit();
		
		/*
		 * entityManager.getTransaction().begin(); c1 = entityManager.merge(c1);
		 * entityManager.remove(c1); entityManager.getTransaction().commit();
		 */

	}

}
