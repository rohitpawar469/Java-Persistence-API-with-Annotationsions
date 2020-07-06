package com.otojpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.otojpa.entities.Invoice;
import com.otojpa.entities.Payment;
import com.otojpa.helper.EntityManagerFactoryHelper;

public class OTOJPATest {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		boolean flag=false;
		Invoice invoice=null;
		Payment payment=null;
		
		try
		{
			entityManagerFactory=EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			
			invoice=new Invoice();
			invoice.setInvoiceDate(new Date());
			invoice.setVendorName("Kabsons Foods ltd.");
			invoice.setDescription("First Payment");
			invoice.setAmount(3500);
			entityManager.persist(invoice);
			
			payment=new Payment();
			payment.setPayeeName("Renuka Foods");
			payment.setPaidDate(new Date());
			payment.setRemarks("Payment Done");
			payment.setAmount(3500);
			payment.setInvoice(invoice);
			entityManager.persist(payment);
			
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
				else {
					transaction.rollback();
				}
				entityManager.close();
			}
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}
				
				

	}

}
