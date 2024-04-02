package com.spring.jdbc.dao;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	public Person() {
		
	}
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.setId(id);
		this.setName(name);
		this.setLocation(location);
		this.setBirthDate(birthDate);
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("\nPerson [id=%s, name=%s, location=%s, birtdate=%s]", id, name, location, birthDate);
	}
	
	
	
}
