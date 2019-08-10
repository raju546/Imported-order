package com.assessment.service;


public class ValidateInput {
	
	//Method to validate the Price and Quantity
	public boolean validate(double price, int quantity) {
		
		boolean check = false;
		
		if(price<0 || quantity<0) {
			check = false;
		}
		else
			check = true;
		
		
		return check;
		
	}

}
