package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {
	
	
	@FindBy(id="pimPersonalDetailsForm")
	public WebElement personalDetailsForm;
	
	@FindBy(id ="firstName")
	public WebElement firstName;
	
	@FindBy(id ="pim.navbar.employeeName")
	public WebElement employeeName;
	
	@FindBy(id ="employeeId")
	public WebElement employeeId;
	
	@FindBy(xpath="//div[@class='toast-message']")
	public WebElement message;
	
	
	public PersonalDetailsPageElements () {
		PageFactory.initElements(driver, this);
	}

}
