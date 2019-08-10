package com.assessment.presentation;

import java.util.Scanner;

import com.assessment.bean.Order;
import com.assessment.service.ServiceCharges;
import com.assessment.service.ValidateInput;

public class ReadData {
	
	//userInput() to read Input from the User
	public void userInput() {
		
		Order order = new Order();
		
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
		System.out.println("Enter the Price in Dollars: ");
 		double price = 0;
		try {
			price = sc.nextInt();
		} catch (Exception e1) {
			
			System.out.println("Please provide the correct values...");
		}
 		
 		System.out.println("Enter the Quantity of Order: ");
 		int quantity = 0;
		try {
			quantity = sc.nextInt();
		} catch (Exception e1) {
			System.out.println("Please provide the correct values...");
		}
 		
 		
 		ValidateInput validateInput = new ValidateInput();
 		try {
			check = validateInput.validate(price, quantity); //calling validate() to validate the price and Quantity
		} catch (Exception e) {
			
			System.out.println("Please give correct values for Price and Quantity...");
			userInput();
		}
 		
 		if(check == true) {
 			
 			//Set the Price and Quantity in the Order class Object
 			order.setPrice(price);
 			order.setQuantity(quantity);
 			
 			ServiceCharges serviceCharges = new ServiceCharges();
 			int orderAmount = serviceCharges.calculateOrder(order); //calling calculateOrder() to calculate the conversion of currency
 			order.setCharges(orderAmount);
 			serviceCharges.calculateTotalAmount(order); //calculateTotalAmount() to calculate the total amount after adding the conversion charges also
 		}
 		else {
 			System.out.println("Sorry!! you enter the incorrect values");
 			ReadData read = new ReadData();
 			read.userInput();
 		}
 		
 		sc.close();
	}

}
