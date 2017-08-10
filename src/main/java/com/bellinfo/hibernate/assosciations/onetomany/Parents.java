package com.bellinfo.hibernate.assosciations.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parents {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String fatherName;
	
	private String motherName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Child> children = new ArrayList<Child>();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public Collection<Child> getChildren() {
		return children;
	}


	public void setChildren(Collection<Child> children) {
		this.children = children;
	}
	
	
	
	

}
