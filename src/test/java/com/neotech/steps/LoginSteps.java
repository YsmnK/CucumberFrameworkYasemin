package com.neotech.steps;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	
//	LoginPageElements login;
//	DashboardPageElements dashboard;
//	
//	@Given("I navigated to the HRM website")
//	public void i_navigated_to_the_hrm_website() throws InterruptedException {
//	    setUp();
//	    
//	    login=new LoginPageElements();
//	    dashboard=new DashboardPageElements();
//	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		
	    sendText(login.username,ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
	    
		sendText(login.password,ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	   
		click(login.loginButton);
		wait(2);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
	   
		String expected="Jacqueline White";
		String actual=dashboard.accountName.getText();
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}

//	@Then("I will quit the browser")
//	public void i_will_quit_the_browser() {
//	
//		tearDown();
//	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
	    sendText(login.password,"password123");
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {
	    
		
		String expected="Invalid Credentials";
		String actual=login.invalidCredentials.getText();
		
		
		wait(2);
		if(expected.equals(actual)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

//	@Then("I will quit the browser")
//	public void i_will_quit_the_browser() {
//	
//		tearDown();
//	}
	
}
