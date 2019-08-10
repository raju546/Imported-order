package com.assessment.dao;

import java.util.ArrayList;
import com.assessment.bean.Order;
import com.assessment.service.ServiceCharges;

public class Repository implements OrderRepo{

	
	//Method to Store the Order Details in the ArrayList
	@Override
	public void saveOrder(Order bean) {
		
		ArrayList<Order> al = new ArrayList<Order>();
		
		al.add(bean);
		
		
		//Pass the ArrayList to the Service Layer class ServiceCharges
		ServiceCharges service = new ServiceCharges();
		service.DatatoPresentation(al);
		
	}

}
