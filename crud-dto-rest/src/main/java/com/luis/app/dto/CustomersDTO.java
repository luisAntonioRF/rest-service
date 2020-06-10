package com.luis.app.dto;

import com.luis.app.entity.Address;

public class CustomersDTO {
	
	private int id_customers;
	private String nameCustomers;
	private String lastName;
	private String email;
	private Address address;
	
	public int getId_customers() {
		return id_customers;
	}
	public void setId_customers(int id_customers) {
		this.id_customers = id_customers;
	}
	public String getNameCustomers() {
		return nameCustomers;
	}
	public void setNameCustomers(String nameCustomers) {
		this.nameCustomers = nameCustomers;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address addressDTO) {
		this.address = addressDTO;
	}
	
	

}
