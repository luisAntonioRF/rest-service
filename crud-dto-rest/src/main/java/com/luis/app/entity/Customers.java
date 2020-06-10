package com.luis.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customers")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3058989298482275569L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_customers;
	
	@Column(name = "name_customers")
	private String nameCustomers;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	@OneToOne(mappedBy = "id_customers")
	@Transient
	private Address address;
	
	/*@OneToMany(fetch = FetchType.LAZY,mappedBy = "id_customers")
	private Address address;*/
	
	public int getId() {
		return id_customers;
	}
	public void setId(int id) {
		this.id_customers = id;
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
	public void setAddress(Address address) {
		this.address = address;
	}

}
