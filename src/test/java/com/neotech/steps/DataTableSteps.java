package com.neotech.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	
	@When("login to the HRMS")
	public void login_to_the_hrms() {
	    System.out.println("Login");
	}
	@When("I want to add Employees")
	public void i_want_to_add_employees(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // List of Maps---what would be the shape of this
	    //Recap-explaining what list  of maps gives us
//	   Map<String,String> map1=new HashMap<>();
//	   map1.put("FN", "Omer");
//	   map1.put("MD", "Faruk");
//	   map1.put("LS", "Turkoglu");
//	    
//	   Map<String,String> map2=new HashMap<>();
//	   map2.put("FN", "Emre");
//	   map2.put("MD", "");
//	   map2.put("LS", "Cinar");
//	   
//	   Map<String,String> map3=new HashMap<>();
//	   map3.put("FN", "Cihan");
//	   map3.put("MD", "Boss");
//	   map3.put("LS", "Abbak");
//	   
//	   List<Map<String,String>> lm=new ArrayList<>();
//	   lm.add(map1);
//	   lm.add(map2);
//	   lm.add(map3);
//	 
	   //getting data from the incoming DataTable
	   
	   List<Map<String,String>> listOfMaps=dataTable.asMaps();
	  
	  for(Map<String,String> map: listOfMaps) {
		  System.out.println(map);
		  System.out.println("........");
		  
		  System.out.println("First Name: " + map.get("FirstName"));
		  System.out.println("Middle Name:" + map.get("MiddleName"));
		  System.out.println("LastName: " + map.get("LastName"));
		  
		  
	  }
	}
	@Then("I validate employee is added")
	public void i_validat_eemployee_is_added() {
	   System.out.println("Validate Employee added");
	}



}
