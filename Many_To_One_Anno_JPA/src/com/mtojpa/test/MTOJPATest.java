package com.mtojpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.mtojpa.entities.Category;
import com.mtojpa.entities.Product;
import com.mtojpa.helper.EntityManagerFactoryHelper;

public class MTOJPATest {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		boolean flag=false;
		Product product=null;
		Category category=null;
		
		try 
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			
			category=new Category();
			category.setCategoryName("Clothing");
			category.setDescription("Gents section");
			entityManager.persist(category);
			
			product=new Product();
			product.setProductName("T-Shirt");
			product.setDescription("Short Shirt");
			product.setManufacturer("Wrangler");
			product.setPrice(850);
			product.setCategory(category);
			entityManager.persist(product);
			
			flag=true;
		}
		finally 
		{
			if (transaction != null)
			{
				if (flag) 
				{
					transaction.commit();	
				}
				else 
				{
					transaction.rollback();
				}
				entityManager.close();
			}
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}

	}

}
