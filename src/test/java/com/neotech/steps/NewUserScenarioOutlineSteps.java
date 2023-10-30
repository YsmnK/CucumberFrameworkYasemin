package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewUserScenarioOutlineSteps extends CommonMethods {

	@When("user enters login info {string} and {string}")
	public void user_enters_login_info_and(String username, String password) {

		sendText(login.username, username);
		sendText(login.password, password);

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginButton);
		wait(2);
	}

	@Then("Welcome {string} message is displayed")
	public void welcome_message_is_displayed(String firstname) {
		if (dashboard.accountName.isDisplayed()) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("test Failed!!!");
		}

	}

}
