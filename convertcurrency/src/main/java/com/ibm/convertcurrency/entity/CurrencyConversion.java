package com.ibm.convertcurrency.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyConversion {
	
	@Id
	private Long id;
	
	@Column(name="currencyFrom")
	private String from;
	@Column(name="currencyTo")
	private String to;
	private BigDecimal factor;
	private BigDecimal quantity;
	private BigDecimal totalAmount ;
	
	public CurrencyConversion() {
		
	}
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal factor, BigDecimal quantity,
			BigDecimal totalAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.factor = factor;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public BigDecimal getFactor() {
		return factor;
	}
	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	
}
