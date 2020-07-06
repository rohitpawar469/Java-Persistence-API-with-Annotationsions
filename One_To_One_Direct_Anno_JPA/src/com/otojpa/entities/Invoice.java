package com.otojpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable
{
	@Id
	@Column(name = "invoice_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int invoiceNo;
	
	@Column(name = "invoice_date")
	protected Date invoiceDate;
	
	@Column(name = "vendor_name")
	protected String vendorName;
	
	protected String description;
	protected double amount;
	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", vendorName=" + vendorName
				+ ", description=" + description + ", amount=" + amount + "]";
	}
	
	
	
	
}
