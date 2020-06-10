package com.luis.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.app.dto.CustomersDTO;
import com.luis.app.entity.Address;
import com.luis.app.entity.Customers;
import com.luis.app.maper.IConverterCustomer;
import com.luis.app.repository.ICreateAddressRepository;
import com.luis.app.repository.ICreateCustomersRepository;
import com.luis.app.service.ICreateCustomersService;

@Service
public class CreateCustomersServiceImpl implements ICreateCustomersService{
	
	@Autowired
	ICreateCustomersRepository createCustomersRepository;	
	
	@Autowired
	ICreateAddressRepository ICreateAddressRepository;
	
	@Autowired
	IConverterCustomer converterCustomer;
	
	@Override
	public void createCustomers(CustomersDTO request) {
		//mapper DTO -> Entity
		Customers customer = converterCustomer.dtoToEntity(request);
			createCustomersRepository.save(customer);
		
		Address address = converterCustomer.dtoToEntityAddress(request);
		ICreateAddressRepository.save(address);
		
	}

}
