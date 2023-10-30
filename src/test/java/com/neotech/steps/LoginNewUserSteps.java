package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginNewUserSteps extends CommonMethods{
	
	@When("user enters username and password and clicks on login")
	public void user_enters_username_and_password_and_clicks_on_login(DataTable dataTable ) {
	
		List<Map<String,String>> listOfMaps=dataTable.asMaps();
		
		 for(Map<String,String> map: listOfMaps) {
			 
			 sendText(login.username ,map.get("username"));
			 sendText(login.password ,map.get("password"));
			 click(login.loginButton);
			 wait(2);
			 if(dashboard.accountName.getText().contains(map.get("firstname"))) {
				 System.out.println("Test Passed!"); 
			  }else {
				  System.out.println("Test failed!!!");
			  }
			}
		 }
	
	@Then("log out")
	public void log_out() {
	    click(dashboard.dropdown);
	    click(dashboard.logOut);
	}


}
