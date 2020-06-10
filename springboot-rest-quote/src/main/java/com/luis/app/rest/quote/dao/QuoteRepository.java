package com.luis.app.rest.quote.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luis.app.rest.quote.entity.Quote;

@Repository
public interface QuoteRepository extends CrudRepository<Quote,Integer> {

}
