 	package com.otojpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "payment")
public class Payment implements Serializable 
{
	@Id
	@Column(name = "invoice_no")
	@GeneratedValue(generator = "foreign_gen")
	@GenericGenerator(name = "foreign_gen", strategy = "foreign", parameters = {@Parameter(name="property",value = "invoice") })
	protected int invoiceNo;
	
	@Column(name = "payee_name")
	protected String payeeName;
	
	@Column(name = "paid_date")
	protected Date paidDate;
	
	protected String remarks;
	protected double amount;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	protected Invoice invoice;

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return "Payment [invoiceNo=" + invoiceNo + ", payeeName=" + payeeName + ", paidDate=" + paidDate + ", remarks="
				+ remarks + ", amount=" + amount + ", invoice=" + invoice + "]";
	}
	
	
	
	
}
