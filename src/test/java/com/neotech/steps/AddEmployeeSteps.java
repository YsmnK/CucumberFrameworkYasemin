package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods{
	
	
	@Given("user navigates to  Add Employee")
	public void user_navigates_to_add_employee() {
	 click(dashboard.PIM);
click(dashboard.addEmployeeLink);
	wait(2);
	}
	@When("user enters valid first name and last name")
	public void user_enters_valid_first_name_and_last_name() {
	sendText(addEmployee.firstName ,"GREYS"); 
	sendText(addEmployee.lastName ,"ANATOMY");
		
	}

    @When("user delelete employee Id")
     public void user_delelete_employee_id() {
    	sendText(addEmployee.employeeId ,"0000097");
    addEmployee.employeeId.clear();
}
	@When("user select the location")
	public void user_select_the_location() {
	 selectDropdown(addEmployee.location,"Australian Regional HQ");
	}
	@When("user click create login details button")
	public void user_click_create_login_details_button() {
		jsClick(addEmployee.loginDetailsToggle);

		wait(2);
	}
	@When("user enter valid user name")
	public void user_enter_valid_user_name() {
	 sendText(addEmployee.username ,"HELLOMARS2000") ; 
	}
	@When("user enter valid password")
	public void user_enter_valid_password() {
		sendText(addEmployee.password ,"#ABCDEFG@1234$$"); 
	}
	@When("user confirm valid password")
	public void user_confirm_valid_password() {
		sendText(addEmployee.confirmPassword ,"#ABCDEFG@1234$$");  
	}
	
	@When("clicks on save button")
	public void clicks_on_save_button() {
		click(addEmployee.saveButton);
	    
	    wait(3);
	}

	@Then("personal details page is displayed")
	public void personal_details_page_is_displayed() {
		String actual="Successfully Saved";
		String expected=personalDetails.message.getText();
		if(actual.equals(expected)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!!!");
		}
	 }
}
