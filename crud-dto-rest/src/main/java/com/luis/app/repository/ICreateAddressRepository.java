package com.luis.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.luis.app.entity.Address;

public interface ICreateAddressRepository extends CrudRepository<Address,Integer> {

}
