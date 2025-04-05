package com.example.asssignment;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@Document
@ToString
public class AcctTransaction {
	@Id
	private String transactionId;
    private String orderId;
    private String transactionType;
    private String tickerSymbol;
    private double transactionPrice;
    private Date orderDateTime = new Date(System.currentTimeMillis());
    private double orderAmt;
    private double balanceAmt;
    
	public AcctTransaction() {
		super();
	}
	
	public AcctTransaction(String orderId, String transactionType, String tickerSymbol, double transactionPrice, double orderAmt, double balanceAmt) {
		super();
		this.orderId = orderId;
		this.transactionType = transactionType;
		this.tickerSymbol = tickerSymbol;
		this.transactionPrice = transactionPrice;
		this.orderDateTime = new Date(System.currentTimeMillis());
		this.orderAmt = orderAmt;
		this.balanceAmt = balanceAmt;
	}
	
	public AcctTransaction(String transactionId, String orderId, String transactionType, String tickerSymbol,
			double transactionPrice, Date orderDateTime, double orderAmt, double balanceAmt) {
		super();
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.transactionType = transactionType;
		this.tickerSymbol = tickerSymbol;
		this.transactionPrice = transactionPrice;
		this.orderDateTime = orderDateTime;
		this.orderAmt = orderAmt;
		this.balanceAmt = balanceAmt;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTickerSymbol() {
		return tickerSymbol;
	}
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}
	public double getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(double transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public Date getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public double getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(double orderAmt) {
		this.orderAmt = orderAmt;
	}
	public double getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(double balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
    
    
}
