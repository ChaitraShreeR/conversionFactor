package com.ibm.conversionfactor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.conversionfactor.entity.ExchangeValue;

@Repository
public interface CurrencyConversionRepository extends JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromAndTo(String from,String to);
}
