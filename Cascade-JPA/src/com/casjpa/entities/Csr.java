package com.casjpa.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.casjpa.entities.Complaint;


@Entity
@Table(name = "csr")
public class Csr implements Serializable 
{
	@Id
	@Column(name = "csr_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int csrNo;
	
	@Column(name = "full_name")
	protected String fullName;
	
	protected String designation;
	protected int experience;
	protected String mobileNo;
	
	@OneToMany(cascade = { CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
	@JoinColumn(name = "csr_no")
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
