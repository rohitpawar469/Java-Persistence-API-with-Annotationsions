package com.otmsjpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.otmsjpa.entities.Account;
import com.otmsjpa.helper.EntityManagerFactoryHelper;

public class BasicJPQLTest {
	public static void main(String[] args) 
	{
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		
		try
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			
			Query query=entityManager.createQuery("from Account");
			List<Account> accounts=query.getResultList();
			 for (Account account : accounts)
			 {
				 System.out.println("Account Holder Name :"+account.getAccountHolderName());
			 }
			
		}
		finally
		{
			if (entityManager != null)
			{
				entityManager.close();
			}
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}

	}

}
