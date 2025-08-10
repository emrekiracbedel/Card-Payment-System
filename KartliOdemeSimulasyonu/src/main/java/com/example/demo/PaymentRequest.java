package com.example.demo;

public class PaymentRequest {

	private String cardNumber;
	private String expiryDate;
	private String cvv2;
	private double amount;

	public PaymentRequest(String cardNumber, String expiryDate, String cvv2, double amount) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv2 = cvv2;
		this.amount = amount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public String getCvv2() {
		return cvv2;
	}

	public double getAmount() {
		return amount;
	}

}
