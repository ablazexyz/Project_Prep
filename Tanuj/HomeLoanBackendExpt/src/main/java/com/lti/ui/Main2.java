package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.CustomerDetails;
import com.lti.model.RegistrationDetails;

public class Main2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		RegistrationDetails registrationDetails = entityManager.find(RegistrationDetails.class, "just@gmail.com");
		
		System.out.println(registrationDetails.getEmailId());
		System.out.println(registrationDetails.getFirstName());
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAadhaarNumber(1234);
		customerDetails.setEmployerName("LTI");
		customerDetails.setMonthlySalary(50000);
		customerDetails.setPAN(3456);
		customerDetails.setRetirementAge(60);
		
		//customerDetails.setRegistrationDetails(registrationDetails);
		
		registrationDetails.setCustomerDetails(customerDetails);
		entityManager.getTransaction().begin();
		entityManager.merge(registrationDetails);
		entityManager.getTransaction().commit();
	}

}
