package org.example.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Person {

	private int id;
	private String name;
	private String surname;
	private String nationalIdentificationNumber;
	
	private Set<Address> addresses = new HashSet<Address>();
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}

	public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	
}
