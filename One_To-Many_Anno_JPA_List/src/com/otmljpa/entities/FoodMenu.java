package com.otmljpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="food_menu")
public class FoodMenu implements Serializable 
{
	@Id
	@Column(name="menu_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int menuNo;
	
	@Column(name = "menu_name")
	protected String menuName;
	
	@Column(name = "menu_type")
	protected String menuType;
	
	protected String description;
	
	@Column(name = "available_timings")
	protected String availableTimings;
	
	@OneToMany
	@JoinColumn(name = "menu_no", nullable=true)
	@OrderColumn(name = "serial_no")
	protected List<FoodItem> foodItems;

	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvailableTimings() {
		return availableTimings;
	}

	public void setAvailableTimings(String availableTimings) {
		this.availableTimings = availableTimings;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	@Override
	public String toString() {
		return "FoodMenu [menuNo=" + menuNo + ", menuName=" + menuName + ", menuType=" + menuType + ", description="
				+ description + ", availableTimings=" + availableTimings + ", foodItems=" + foodItems + "]";
	}

		
	
}
