package com.ranjen.jackson_databind_json_demo;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
//there is new property company added to the json.
//Let say you want to ignore that property when perfrom the databinding
//So we use this ignore annotation which will ignore all the unknown properties
//and continue flow of the program without any error.
public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	
	//add nested object
	private Address address;
	
	//add array
	private String[] languages;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
}
