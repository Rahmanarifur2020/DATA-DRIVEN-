package com.TestNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {

	// Methods with @Test Annotation are reffered as Test mehods
	// @Test : it is used when we want to execute a Test Method
	// @Test(priority='1') : used to prioritize your test case

	// @BeforeMethod: This annotation represents that the method will get executed
	// before every test method in the class

	// @AfterMethod : This annotation represents that the method will get executed
	// after every test method in the class

	// @BeforeClass : This annotation represents that the method will get executed
	// before any test method in the class and this method will be executed only
	// once

	// @AfterClass : This annotation represents that the method will get executed
	// after all the test method , before methods, aftermethods are executed in the
	// class
	// and this method will be executed only once
	
	@BeforeSuite
	public void suiteTest() {
		
		System.out.println("This method will be executed before the suite begins");
	}
	
	
	

	@BeforeTest // this method will get executed before every test in our xml file
	public void exampletest() {
		System.out.println("This mehod will be execute before the test begins");
	}

	@BeforeClass
	public void login() {
		System.out.println("Script to loginto the application");
	}

	@BeforeMethod
	public void Timeouts() {
		System.out.println("Wait for 20 seconds before executing");
	}

	@Test(priority = '1')
	public void createCust() {
		System.out.println("Script to reate a customer details");
	}

	@Test(priority = '2')
	public void searchCust() {
		System.out.println("Search customer in application script");
	}

	@Test(priority = '3')
	public void deleteCust() {
		System.out.println("Delete customer from application sctipt");
	}

	@AfterMethod
	public void cookiesde1() {
		System.out.println("Delete the cookies from the browser");
	}

	@AfterClass
	public void logout() {
		System.out.println("logout of the application and close browser");
	}

}
