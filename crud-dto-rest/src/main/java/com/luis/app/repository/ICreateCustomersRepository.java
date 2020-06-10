package com.luis.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.luis.app.entity.Customers;

public interface ICreateCustomersRepository extends CrudRepository<Customers,Integer>{

}
