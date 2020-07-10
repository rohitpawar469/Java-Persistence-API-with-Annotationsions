package com.otmljpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_item")
public class FoodItem implements Serializable
{	
	@Id
	@Column(name = "item_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int itemNo;
	
	@Column(name = "item_name")
	protected String itemName;
	
	protected String ingredients;
	
	@Column(name = "preparation_method")
	protected String preparationMethod;
	
	protected double amount;
	
	
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getPreparationMethod() {
		return preparationMethod;
	}
	public void setPreparationMethod(String preparationMethod) {
		this.preparationMethod = preparationMethod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "FoodItem [itemNo=" + itemNo + ", itemName=" + itemName + ", ingredients=" + ingredients
				+ ", preparationMethod=" + preparationMethod + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
}
