package com.otmsjpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.otmsjpa.entities.Account;
import com.otmsjpa.helper.EntityManagerFactoryHelper;

public class ExploreJPQLTest {

	private static List<Account> accounts;

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		Account account=null;
		String accountType=null;
		List<Account> accounts=null;
		try
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			
		//showAllAccountsByAccountType(entityManager, "Savings");
			showOperatingBranches(entityManager);
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
	
	private static void showAllAccountsByAccountType(EntityManager entityManager,String accountType)
	{
		TypedQuery<Account> showAllAccountsByAccountTypeQuery=null;
		
		showAllAccountsByAccountTypeQuery=entityManager.createNamedQuery("from account a where a.accountType= ?", Account.class);
		
		showAllAccountsByAccountTypeQuery.setParameter(1, accountType);
		
		accounts=showAllAccountsByAccountTypeQuery.getResultList();
		printAccounts(accounts);
		
	}
	
	private static void printAccounts(List<Account> accounts)
	{
		for (Account account : accounts)
		{
			System.out.println(account);
		}
		
	}
	
	private static void showOperatingBranches(EntityManager entityManager)
	{
		TypedQuery<String> getOperatingBranchesQuery =null;
		List<String> branchNames= null;
		
		getOperatingBranchesQuery=entityManager.createQuery("select distinct a.branch from Account a" , String.class);
		branchNames=getOperatingBranchesQuery.getResultList();
		for (String branchName : branchNames) 
		{
			System.out.println(branchName);
		}
		
	}
	
	
	
	
	

}
