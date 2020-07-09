package com.invjpa.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "branch")
public class Branch implements Serializable
{
	@Id
	@Column(name = "branch_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int branchNo;
	
	@Column(name = "branch_name")
	protected String branchName;
	
	@Column(name = "organisation_name")
	protected String organisationName;
	
	@Column(name = "contact_no")
	protected String contactNo;
	
	@Column(name = "email_address")
	protected String emailAddress;
	protected String location;
	
	@OneToMany(mappedBy = "branch")
		//@JoinColumn(name = "branch_no", nullable = true)
	protected Set<Staff> branchStaff;
	
	public int getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Staff> getBranchStaff() {
		return branchStaff;
	}
	public void setBranchStaff(Set<Staff> branchStaff) {
		this.branchStaff = branchStaff;
	}
	
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", organisationName=" + organisationName
				+ ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + ", location=" + location
				+ ", branchStaff=" + branchStaff + "]";
	}
	
	
	
	
}
