package com.Aseem.Collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mMap = new HashMap<String, String>();
		
		//Add key-values to map
		mMap.put("Name", "Aseem");
		mMap.put("Age", "31");
		
		//Retrieve values from map
		for(String key: mMap.keySet())
		{
			System.out.println(key+" "+mMap.get(key)); 
		}

		System.out.println("Data Change");

		//Adding new data
		mMap.put("Gender", "Male");
		
		//Removing old data
		mMap.remove("Age");
		
		System.out.println("New output:");
	    // Output
	    for (String key : mMap.keySet()) {
	      System.out.println(key +" "+ mMap.get(key));
	    }

	}

}
