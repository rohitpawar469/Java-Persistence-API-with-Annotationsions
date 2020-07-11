package com.otmjpa.test;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.otmjpa.entities.ContractWork;
import com.otmjpa.entities.Material;
import com.otmjpa.helper.EntityManagerFactoryHelper;

public class OTMJPATest {
	public static void main(String[] args) 
	{
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		boolean flag=false;
		ContractWork contractWork=null;
		Material material=null;
		Map<String, Material> materialsUsed=null;

		try
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			
			materialsUsed=new HashMap<String, Material>();
			
			material=new Material();
			
			
			
			
			
			
			
			flag=true;
		} 
		finally
		{
			if (entityTransaction != null)
			{
				if (flag)
				{
					entityTransaction.commit();
				}
				else 
				{
					entityTransaction.rollback();
				}
				entityManager.close();
			}
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}
	}

}
