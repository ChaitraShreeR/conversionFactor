package com.ibm.conversionfactor.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name="currencyFrom")
	private String from;
	
	@Column(name="currencyTo")
	private String to;
	
	private BigDecimal factor;
	
	
	
	public ExchangeValue(Long id, String from, String to, BigDecimal factor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.factor = factor;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public ExchangeValue() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	

	public BigDecimal getFactor() {
		return factor;
	}

	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}
	
	
	
}
