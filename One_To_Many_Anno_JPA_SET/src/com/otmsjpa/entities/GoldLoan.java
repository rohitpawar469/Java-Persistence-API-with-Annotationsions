package com.otmsjpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "gold_loan")
public class GoldLoan implements Serializable  
{
	@Id
	@Column(name = "loan_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int loanNo;
	
	@Column(name = "weight_in_grams")
	protected int weightInGrams;
	
	protected int tenure;
	@Column(name = "interest_rate")
	protected int interestRate;
	
	protected double amount; 
	
	@Column(name="processing_fee")
	protected double processingFee;
	
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getWeightInGrams() {
		return weightInGrams;
	}
	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}
	
	@Override
	public String toString() {
		return "GoldLoan [loanNo=" + loanNo + ", weightInGrams=" + weightInGrams + ", tenure=" + tenure
				+ ", interestRate=" + interestRate + ", amount=" + amount + ", processingFee=" + processingFee + "]";
	}
	
	
}
