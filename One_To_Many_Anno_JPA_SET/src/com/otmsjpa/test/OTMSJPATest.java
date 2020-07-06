package com.otmsjpa.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.otmsjpa.entities.Account;
import com.otmsjpa.entities.GoldLoan;
import com.otmsjpa.helper.EntityManagerFactoryHelper;

public class OTMSJPATest {
	public static void main(String[] args)
	{
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		Account account = null;
		GoldLoan goldLoan = null;
		Set<GoldLoan> goldLoans=null;

		try 
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			goldLoans=new HashSet<>();
			
			goldLoan=new GoldLoan();
			goldLoan.setWeightInGrams(10);
			goldLoan.setTenure(36);
			goldLoan.setInterestRate(8);
			goldLoan.setProcessingFee(5000);
			goldLoan.setAmount(50000);
			
			entityManager.persist(goldLoan);
			goldLoans.add(goldLoan);		
			
			
			
			goldLoan=new GoldLoan();
			goldLoan.setWeightInGrams(50);
			goldLoan.setTenure(12);
			goldLoan.setInterestRate(10);
			goldLoan.setProcessingFee(2000);
			goldLoan.setAmount(250000);
			
			entityManager.persist(goldLoan);
			goldLoans.add(goldLoan);
			
			account=new Account();
			account.setAccountHolderName("Rohit Pawar");
			account.setAccountType("Savings Account");
			account.setBranch("Malegaon");
			account.setBalance(50000);
			account.setGoldloans(goldLoans);
			entityManager.persist(account);
			
			
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
