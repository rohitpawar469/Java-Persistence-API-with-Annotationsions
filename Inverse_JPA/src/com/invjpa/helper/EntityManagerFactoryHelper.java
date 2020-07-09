package com.invjpa.helper;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper
{
	private static EntityManagerFactory entityManagerFactory;
	
	static
	{
		try 
		{
			entityManagerFactory=Persistence.createEntityManagerFactory("hibpu");
		}
		catch (Throwable t)
		{
			t.printStackTrace();
			throw t;
		}
	}

	public static EntityManagerFactory getEntityManagerFactory() 
	{
		return entityManagerFactory;
	}
	
	public static void closeEntityManagerFactory()
	{
		if (entityManagerFactory != null) 
		{
			entityManagerFactory.close();
			entityManagerFactory=null;
		}
	}
	
}
