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
	public String getMaterialName() {
		return materialName;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Material [materialNo=" + materialNo + ", materialName=" + materialName + ", quantity=" + quantity
				+ ", amount=" + amount + "]";
	}
	
	
	
}
