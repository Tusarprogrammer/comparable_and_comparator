package com.intellitech.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleList {

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("Data0");
		data.add("Data1");
		data.add("Data0");
		//data.add("Data3");
		System.out.println(data);
		
		System.out.println(data.get(0));
		//data.re
		//System.out.println(data.reverse());
		List<String> originalData = data;
		Collections.reverse(data);
		
		if(originalData.equals(data)) {
			System.out.println("both the lists are same");
		}
		
		System.out.println(data);
		
		
		
	}

}
