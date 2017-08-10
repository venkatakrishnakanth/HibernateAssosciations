package com.bellinfo.hibernate.assosciations.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Owner {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	

}
