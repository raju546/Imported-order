package com.assessment.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.assessment.bean.Order;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Displaying Main Menu to the Console
		mainMenu(null);
		
	}

	
	public static void mainMenu(ArrayList<Order> arrayList) {
		System.out.println("WELCOME");
		System.out.println();
		System.out.println("1. Enter the Details\n2. Display Details\n3. Exit");
		System.out.println("Enter your choice: ");
		
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		try {
			ch = scan.nextInt();
		} catch (Exception e1) {
			
			System.out.println("Please give values in correct format...");
		}
		
		switch(ch) {
		
		case 1: ReadData readData = new ReadData(); 
				readData.userInput(); //Method to input the Price and Quantity by the user
				break;
				
		case 2: DisplayData displayData = new DisplayData();
			try {
				displayData.showData(arrayList); //Method to Display the Output to the User on the Console
			} catch (NullPointerException e) {
				
				System.out.println("First you have to Enter the Details!!");
				mainMenu(null); //Again calling mainMenu() if user directly press 2 without Inputing the values 
			}
			break;
			
		case 3: System.exit(0); //To terminate the Program
		
		default: System.out.println("You enter the Wrong Choice...");
		}
		
		scan.close();
	}
}
