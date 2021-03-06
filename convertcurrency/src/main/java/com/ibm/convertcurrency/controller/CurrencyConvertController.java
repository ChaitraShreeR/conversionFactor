package com.ibm.convertcurrency.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.convertcurrency.entity.CurrencyConversion;

@RestController
public class CurrencyConvertController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		return new CurrencyConversion(1000L,from,to,BigDecimal.valueOf(65),quantity,quantity);
	}
	
}
