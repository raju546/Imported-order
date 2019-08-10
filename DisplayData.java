package com.assessment.presentation;

import java.util.ArrayList;
import java.util.Iterator;

import com.assessment.bean.Order;

public class DisplayData {
	
	public void showData(ArrayList<Order> arrayList) {
		
		Iterator itr = arrayList.iterator();
		
		//Using Iterator, Iterate the ArrayList and printing the values to the console
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
