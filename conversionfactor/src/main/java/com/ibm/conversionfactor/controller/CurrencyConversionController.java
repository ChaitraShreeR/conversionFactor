package com.ibm.conversionfactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.conversionfactor.entity.ExchangeValue;
import com.ibm.conversionfactor.repository.CurrencyConversionRepository;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyConversionRepository currencyRepo;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}")
	public ExchangeValue retrieveFactor(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchangeValue=currencyRepo.findByFromAndTo(from, to);
		return exchangeValue;
	}
}
