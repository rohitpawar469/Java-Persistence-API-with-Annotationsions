package com.otmsjpa.entities;

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

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "account")
public class Account implements Serializable 
{
	@Id
	@Column(name = "account_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int accountNo;
	
	@Column(name = "account_holder_name")
	protected String accountHolderName;
	
	@Column(name = "account_type")
	protected String accountType;
	
	protected String branch;
	protected double balance;
	
	@OneToMany
	@JoinColumn(name = "account_no",nullable = true)
	protected Set<GoldLoan> goldloans;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<GoldLoan> getGoldloans() {
		return goldloans;
	}
	public void setGoldloans(Set<GoldLoan> goldloans) {
		this.goldloans = goldloans;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", branch=" + branch + ", balance=" + balance + ", goldloans=" + goldloans + "]";
	}
	
	
}
