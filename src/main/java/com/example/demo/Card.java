package com.example.demo;

import java.security.PublicKey;

public class Card {
	
	private String cardNumber;
	private String name;
	private String expiryDate;
	private String cvv2;
	private double balance;
	
	public Card(String cardNumber, String name, String expiryDate, String cvv2, double balance)
	
	{
		this.cardNumber = cardNumber;
		this.name = name;
		this.expiryDate = expiryDate;
		this.cvv2 = cvv2;
		this.balance = balance;	
	}
	
	public String getCardnumber() {
		return cardNumber;
		}
	
	public String getName() {
		return name;
		}
	
	public String getExpiryDate() {
		return expiryDate;
		}
	
	public String getCvv2() {
		return cvv2;
	    }
	
	public double getBalance() {
		return balance;
		}
	
	public void setBalance(double balance) {
		this.balance = balance;
		}
	
	

	
}
