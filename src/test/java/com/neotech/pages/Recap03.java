package com.neotech.pages;

public class Recap03 {
//	
//	1. Data Driven Testing - Cucumber
//
//	a - Parametrized testing:
//		We pass parameters " " for each variable you want to pass as argument
//
//	b. Data driven testing with scenario outline and Example:
//		- Feature file is the boss: it will run the scenario as many times as there is data to process
//		- The java step method will only do the functionality part of the scenario
//
//	c. Data driver testing with DataTable:
//		- Java step method is the boss: the feature file sends all the data at once in a DataTable to the java step method.
//		- Java step method handles the loops
//
//	b vs c:
//	- In b the scenario is run multiple times and each time only one set of data is sent to the java step method. This means that the driver loads and quits for each scenario run.
//	- In c the scenario runs only one time, and performs as many loops it need for the data inside the java step method. This means that the driver loads only once and quits after all the loops are done and scenario finishes.
//	----------------------------------------------------------------
//	List of Maps BreakDown: 
//		|FirstName| MiddleName | LastName |
//		|James	  |	J		   | Smith	  |
//		|Emily	  |	A          | Brown	  |
//
//	MAP< String, String>
//
//	"FirstName", "James"
//	"MiddleName", "J"			=>	m1
//	"LastName", "Smith"
//
//	"FirstName", "Emily"
//	"MiddleName", "A"			=>	m2
//	"LastName", "Brown"
//	----------------------------------------------------------------
//	List<MAP<String, String>>   = {m1,m2.....}
//
//	--we go to add employee for m1:
//		for m1 we save FN, MN and LN 
//		then we add the employee
//	--we go again to add employee for m2
//		for m2 we save FN, MN and LN
//		then we add employee 
//	--we go again to add employee
//		...	
//	

}
