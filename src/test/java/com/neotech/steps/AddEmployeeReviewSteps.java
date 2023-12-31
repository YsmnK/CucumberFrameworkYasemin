package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeReviewSteps extends CommonMethods {

	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
		click(dashboard.PIM);
		click(dashboard.addEmployeeLink);
	}
	// Hard-coded step
	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
		sendText(addEmployee.firstName, "Lionel");
		sendText(addEmployee.lastName, "Messi");
	}

	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropdown(addEmployee.location, "New York Sales Office");	
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button(){
		
		wait(2);
		click(addEmployee.saveButton);
	}
 //hard coded Validation
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
	
		waitForVisibility(personalDetails.personalDetailsForm);
		String expected = "Lionel Messi";
		String actual = personalDetails.employeeName.getText();
		
		Assert.assertEquals("The employee name DOES NOT match!", expected, actual);
	}

}
