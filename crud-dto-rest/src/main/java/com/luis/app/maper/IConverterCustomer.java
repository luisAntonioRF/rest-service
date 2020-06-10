package com.luis.app.maper;

import com.luis.app.dto.CustomersDTO;
import com.luis.app.entity.Address;
import com.luis.app.entity.Customers;

public interface IConverterCustomer {
	public abstract Customers dtoToEntity(CustomersDTO dto);
	
	public abstract Address dtoToEntityAddress(CustomersDTO dto);
}
