package com.casjpa.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.casjpa.entities.Complaint;
import com.casjpa.entities.Csr;
import com.casjpa.helper.SessionFactoryRegistry;

public class CASJPATest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Csr csr = null;
		Complaint complaint = null;
		Set<Complaint> assignedComplaints = null;

		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			assignedComplaints=new HashSet<>();
			  
			  complaint=new Complaint();
			  csr=new Csr();
			  
			  complaint.setTitle("Phone not switching on");
			  complaint.setDescription("Not Working");
			  complaint.setPriority(1);
			  complaint.setSeverity(1);
			  complaint.setReportedDate(new Date());
			  complaint.setStatus("open");
			  
			  assignedComplaints.add(complaint);
			  // without cascade save-update we should save the compliant
			  
			  
			  
			  complaint.setTitle("Screen Damaged");
			  complaint.setDescription("Physical Damaged"); complaint.setPriority(2);
			  complaint.setSeverity(3); complaint.setReportedDate(new Date());
			  complaint.setStatus("open");
			  
			  assignedComplaints.add(complaint);
			  
			  csr=new Csr();
			  
			  csr.setFullName("Jitesh Sonar"); csr.setDesignation("Junior");
			  csr.setExperience(2); csr.setMobileNo("123456");
			  csr.setAssignedComplaints(assignedComplaints); 
			  session.persist(csr);
			 
			
			
			flag=true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}

}
