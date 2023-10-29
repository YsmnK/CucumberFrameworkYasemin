@addEmployee
Feature: Add Employee

 
  Scenario: Add Employee with first and last name
    Given user is logged in with valid credentials
    And user navigates to  Add Employee
    When user enters valid first name and last name
    And user select the location
    And clicks on save button
    Then personal details page is displayed

 
  Scenario: Add Employee without employee id
    Given user is logged in with valid credentials
    And user navigates to  Add Employee
    When user enters valid first name and last name
    And user delelete employee Id
    And user select the location
    And clicks on save button
    Then personal details page is displayed

  
  Scenario: Add Employee and create login Credentials
    Given user is logged in with valid credentials
    And user navigates to  Add Employee
    When user enters valid first name and last name
    And user select the location
    And user click create login details button
    When user enter valid user name
    When user enter valid password
    And user confirm valid password
    And clicks on save button
    Then personal details page is displayed
