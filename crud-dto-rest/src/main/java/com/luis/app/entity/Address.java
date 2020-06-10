package com.luis.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6154053330466740440L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_address;
	
	private String street;
	
	@Column(name = "postal_code")
	private int postalCode;
	
	private String reference;
	
	@OneToOne()
	@JoinColumn(name = "id_customers")
	private Customers id_customers;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customers")
	private int id_customers;*/
	
	
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
	public Customers getId_customers() {
		return id_customers;
	}
	public void setId_customers(Customers id_customers) {
		this.id_customers = id_customers;
	}
	
	

}
