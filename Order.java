package com.assessment.bean;


//Bean Layer POJO Class
public class Order {
	
	private int id;
	private double price;
	private int quantity;
	private double amount;
	private double charges;
	
	public Order() {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order Details: \n" + "\nOrderId=" + id + "\nQuantity=" + quantity + "\nPrice=" + price + "\nTotal Charges="
				+ amount;
	}

	
}
