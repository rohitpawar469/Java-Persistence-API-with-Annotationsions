package com.otmsjpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
