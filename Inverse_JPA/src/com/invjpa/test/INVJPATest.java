package com.invjpa.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.invjpa.entities.Branch;
import com.invjpa.entities.Staff;
import com.invjpa.helper.EntityManagerFactoryHelper;

public class INVJPATest {

	public static void main(String[] args) 
	{
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory= null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Branch branch=null;
		Staff staff=null;
		Set<Staff> staffSet=null;

		try 
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			staffSet=new HashSet<>();
			
			
			branch=new Branch();
			branch.setBranchName("Camp Road");
			branch.setContactNo("123456");
			branch.setEmailAddress("contactus@grillin.com");
			branch.setLocation("Nashik");
			branch.setOrganisationName("Renuka Foods");
			
			staff=new Staff();
			staff.setFullName("Rohit Pawar");
			staff.setAge(25);
			staff.setGender("Male");
			staff.setMobileNo("789456123");
			staffSet.add(staff);
			
			staff.setBranch(branch);
			
			
			branch.setBranchStaff(staffSet);
			entityManager.persist(branch);
			entityManager.persist(staff);
			
			
			
			
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				entityManager.close();
			}
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}
		
	}

}
