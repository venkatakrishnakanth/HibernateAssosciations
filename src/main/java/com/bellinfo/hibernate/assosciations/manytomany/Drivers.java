package com.bellinfo.hibernate.assosciations.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Drivers {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="drivers")
	private Collection<Car> cars = new ArrayList<Car>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Car> getCars() {
		return cars;
	}

	public void setCars(Collection<Car> cars) {
		this.cars = cars;
	}
	

	
	
}
