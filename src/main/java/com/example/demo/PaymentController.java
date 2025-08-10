package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	//private final PaymentProcessor paymentProcessor;

	@Autowired
	public PaymentController() {
	//	this.paymentProcessor = paymentProcessor;
	}

	@PostMapping
	public String processPayment(@RequestBody PaymentRequest request) {

		

		

		 PaymentProcessor paymentProcessor = new PaymentProcessor();

		PaymentResult result = paymentProcessor.process(request);
		return result.getMessage();
	}
}



