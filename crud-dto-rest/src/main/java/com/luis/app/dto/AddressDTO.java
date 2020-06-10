package com.luis.app.dto;

public class AddressDTO {
	
	private int id_address;
	private String street;
	private int postalCode;
	private String reference;
	
	public int getId_address() {
		return id_address;
	}
	public void setId_address(int id_address) {
		this.id_address = id_address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	

}
