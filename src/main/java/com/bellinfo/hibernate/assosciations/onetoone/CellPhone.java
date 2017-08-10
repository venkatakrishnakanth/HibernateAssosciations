package com.bellinfo.hibernate.assosciations.onetoone;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CellPhone {
	
	@Id
	private int cellId;
	
	private String model;
	
	private String company;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Owner owner = new Owner();


	public int getCellId() {
		return cellId;
	}


	public void setCellId(int cellId) {
		this.cellId = cellId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	
	
	
	

}
