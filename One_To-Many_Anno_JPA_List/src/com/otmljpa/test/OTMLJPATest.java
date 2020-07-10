package com.otmljpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.otmljpa.entities.FoodItem;
import com.otmljpa.entities.FoodMenu;
import com.otmljpa.helper.EntityManagerFactoryHelper;

public class OTMLJPATest {
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		boolean flag=false;
		FoodItem foodItem=null;
		FoodMenu foodMenu=null;
		List<FoodItem> foodItems=null;
		
		try
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			foodItems=new ArrayList<FoodItem>();
			
			foodItem=new FoodItem();
			foodItem.setItemName("Chiken Pizza");
			foodItem.setIngredients("Fried Chiken");
			foodItem.setPreparationMethod("Owen Fry");
			foodItem.setAmount(350);
			entityManager.persist(foodItem);
			foodItems.add(foodItem);
			
			
			foodItem=new FoodItem();
			foodItem.setItemName("Muncharian Fried Rice");
			foodItem.setIngredients("Vegetable Muncharian");
			foodItem.setPreparationMethod("oil Fry");
			foodItem.setAmount(150);
			entityManager.persist(foodItem);
			foodItems.add(foodItem);
			
			foodMenu=new FoodMenu();
			foodMenu.setMenuName("Starters");
			foodMenu.setMenuType("6pm Onwards");
			foodMenu.setDescription("Chinese Food");
			foodMenu.setAvailableTimings("6pm-11pm");
			foodMenu.setFoodItems(foodItems);
			
			entityManager.persist(foodMenu);
			
			
			flag=true;
		} 
		finally
		{
			if (entityTransaction !=null)
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
