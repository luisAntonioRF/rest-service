package com.luis.app.maper;

import org.springframework.stereotype.Component;

import com.luis.app.dto.CustomersDTO;
import com.luis.app.entity.Address;
import com.luis.app.entity.Customers;

@Component
public class ConverterCustomerImpl implements IConverterCustomer {

	@Override
	public Customers dtoToEntity(CustomersDTO dto) {
		Customers customer=new Customers();
		
		customer.setNameCustomers(dto.getNameCustomers());
		customer.setLastName(dto.getLastName());
		customer.setEmail(dto.getEmail());
		return customer;
	}

	@Override
	public Address dtoToEntityAddress(CustomersDTO dto) {
		Address address = new Address();
		
		address.setStreet(dto.getAddress().getStreet());
		address.setPostalCode(dto.getAddress().getPostalCode());
		address.setReference(dto.getAddress().getReference());
		return address;
	}

}
