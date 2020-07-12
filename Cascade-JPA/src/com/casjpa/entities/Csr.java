package com.casjpa.entities;

import java.io.Serializable;
import java.util.Set;

import com.casjpa.entities.Complaint;

public class Csr implements Serializable 
{
	protected int csrNo;
	protected String fullName;
	protected String designation;
	protected int experience;
	protected String mobileNo;
	Set<Complaint> assignedComplaints;
	
	
	public int getCsrNo() {
		return csrNo;
	}
	public void setCsrNo(int csrNo) {
		this.csrNo = csrNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Set<Complaint> getAssignedComplaints() {
		return assignedComplaints;
	}
	public void setAssignedComplaints(Set<Complaint> assignedComplaints) {
		this.assignedComplaints = assignedComplaints;
	}
	
	
	@Override
	public String toString() {
		return "Csr [csrNo=" + csrNo + ", fullName=" + fullName + ", designation=" + designation + ", experience="
				+ experience + ", mobileNo=" + mobileNo + ", assignedComplaints=" + assignedComplaints + "]";
	}
	
	
	
	
	
}
