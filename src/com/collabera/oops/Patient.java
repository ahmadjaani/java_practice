package com.collabera.oops;

public class Patient {
	private int id;
	private String name;
	private String city;
	private long contact;
	
	//zero-arg constructor
	public Patient() {
		
	}

	//parameterized constructor
	public Patient(int id, String name, String city, long contact) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.contact = contact;
	}


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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}
	
	//getter methods used to get/read private fields
	//setter methods used to set/write private fields
	
}
