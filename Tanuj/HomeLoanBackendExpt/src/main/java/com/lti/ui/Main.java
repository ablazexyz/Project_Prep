package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.RegistrationDetails;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		RegistrationDetails registrationDetails1 = new RegistrationDetails();
		registrationDetails1.setEmailId("tans.c2@gmail.com");
		registrationDetails1.setFirstName("Tanuj");
		registrationDetails1.setLastName("Chakraborty");
		registrationDetails1.setGender("Male");
		registrationDetails1.setNationality("Indian");
		registrationDetails1.setPassword("abcde");
		registrationDetails1.setPhoneNumber(12345678);
		
		entityManager.getTransaction().begin();
		entityManager.persist(registrationDetails1);
		entityManager.getTransaction().commit();

	}

}
