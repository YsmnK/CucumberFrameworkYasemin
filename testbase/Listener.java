package com.neotech.testbase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.neotech.utils.CommonMethods;


public class Listener implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("Functionality Test Started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Functionality Test Finished");
	}

	public void onTestStart(ITestResult result) {
		//Printing logs to the console
		System.out.println("Test Will Start: " + result.getName());
		
		//Creating a test on the report-- to use it to log into ExtenReports
		BaseClass.test=BaseClass.report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		//Printing logs to the console
		System.out.println("Test Passed: " + result.getName());
		
		// Print test passed on the report
		BaseClass.test.pass("Test Passed: "+ result.getName());
		
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/" + result.getName()));
	}

	public void onTestFailure(ITestResult result) {
		// Printing logs to the console
		System.out.println("Test Failed: " + result.getName());
		
		// Print test passed on the report
		BaseClass.test.fail("Test Passed: " + result.getName());
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/" + result.getName()));
	}
}

