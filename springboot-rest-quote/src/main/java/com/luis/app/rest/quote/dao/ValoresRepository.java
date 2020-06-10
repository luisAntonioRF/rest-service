package com.luis.app.rest.quote.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.app.rest.quote.entity.Value;

@Repository
public interface ValoresRepository extends CrudRepository<Value,Integer> {

}
