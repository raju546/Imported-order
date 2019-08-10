package com.assessment.service;

import java.util.ArrayList;
import java.util.Random;

import com.assessment.bean.Order;
import com.assessment.dao.OrderRepo;
import com.assessment.dao.Repository;
import com.assessment.presentation.MainClass;

public class ServiceCharges implements OrderService{

	
	//convert the $ into INR Currency

	@Override
	public int calculateOrder(Order bean) {
		int orderAmount = 0;
		
		orderAmount = (int) (bean.getPrice() * 75);
		
		return orderAmount;
	}
	
	
	//Method to calculate total Amount after adding the conversion charges also
	public void calculateTotalAmount(Order order) {
		
		double totalAmount = 0.0;
		double conversionCharges = (1.25/100)*order.getCharges();
		totalAmount = order.getQuantity() * conversionCharges;
		
		
		order.setAmount(totalAmount);
		
		Random rand = new Random();
		
		//Generating a Random Number as ID using Random Class 
		int id = rand.nextInt(100);
		
		order.setId(id);
		
		
		//Pass the object to DAO Layer class Repository
		OrderRepo orderRepo = new Repository();
		orderRepo.saveOrder(order);
		
		
		
	}
	
	public void DatatoPresentation(ArrayList<Order> arrayList) {
	
		//Passing the Array List from DAO Layer class to Presentation Layer Class
		MainClass.mainMenu(arrayList);
		
	}
}
