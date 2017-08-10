package com.bellinfo.hibernate.assosciations.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Car {
	
	@Id
	@GeneratedValue
	private int carid;
	
	private String carName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	Collection<Drivers> drivers = new ArrayList<Drivers>();


	public int getCarid() {
		return carid;
	}


	public void setCarid(int carid) {
		this.carid = carid;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public Collection<Drivers> getDrivers() {
		return drivers;
	}


	public void setDrivers(Collection<Drivers> drivers) {
		this.drivers = drivers;
	}
	
	
	


}
