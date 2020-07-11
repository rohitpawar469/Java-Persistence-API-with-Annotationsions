package com.otmjpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class Material implements Serializable
{
	@Id
	@Column(name = "material_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int materialNo;
	
	@Column(name = "material_name")
	protected String materialName;
	
	protected int quantity;
	protected double amount;
	
	
	public int getMaterialNo() {
		return materialNo;
	}


	public void setMaterialNo(int materialNo) {
		this.materialNo = materialNo;
	}


	public String getMaterialName() {
		return materialName;
	}


	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Material [materialNo=" + materialNo + ", materialName=" + materialName + ", quantity=" + quantity
				+ ", amount=" + amount + "]";
	}
	
	
	
}
