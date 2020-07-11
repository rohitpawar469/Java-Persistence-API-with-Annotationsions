package com.otmjpa.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "contract_work")
public class ContractWork implements Serializable
{
	@Id
	@Column(name = "contractWork_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int contractWorkNo;
	
	@Column(name = "contract_work_name")
	protected String contractWorkName;
	
	protected int duration;
	protected int budget;
	
	@OneToMany
	@MapKeyColumn(name = "procurement_no")
	@JoinColumn(name = "contractWork_no")
	protected Map<String, Material> usedMaterials;
	
	public int getContractWorkNo() {
		return contractWorkNo;
	}
	public String getContractWorkName() {
		return contractWorkName;
	}
	public int getDuration() {
		return duration;
	}
	public int getBudget() {
		return budget;
	}
	public Map<String, Material> getUsedMaterials() {
		return usedMaterials;
	}
	@Override
	public String toString() {
		return "ContractWork [contractWorkNo=" + contractWorkNo + ", contractWorkName=" + contractWorkName
				+ ", duration=" + duration + ", budget=" + budget + ", usedMaterials=" + usedMaterials + "]";
	}
	
	
	
}
