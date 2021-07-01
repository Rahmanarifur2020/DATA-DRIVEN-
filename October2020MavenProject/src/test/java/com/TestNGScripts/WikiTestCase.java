package com.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//@BeforeClass @BeforeMethod @Test @AfterMethod @AfterClass
public class WikiTestCase {

//33 in TestNG our test steps for test cases will be written as methods
	// all methods will be void in TestNG except data driven
	// TestNG annotation to execute a test case

	// create a method as test case
	// A methods used to perform test case is called a test method
	// if we have to execute a test method , we will use a TestNG annotation called
	// as @Test
	// annotation will be written over the method name
	// will execute this method in the begining
	//for test case to be executed in correct format or sequence ,we use priority to test case
	public static WebDriver driver;
	
	//@BeforeClass
	//Before class annotation will get executed as the first method of the class only once

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khadiza rahman\\eclipse-workspace\\October2020_Selenium\\SeleniumProject\\driver2\\chromedriver.exe");
		;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");	}

	
	// A method with an annotation @BeforeMethod will get executed before every test method in your class
	@BeforeMethod
	public void login() {
		
		System.out.println("loginto the application, enter username and password");
	}
	
	
	
	
	
	// start exeution 
	@Test(priority='1')
	public void createAccount() throws InterruptedException // public datatype methodname
	{
		// test steps to perform test case goes here

		driver.findElement(By.name("wpName")).sendKeys("Sumon");
		driver.findElement(By.id("wpPassword2")).sendKeys("abc123");
		driver.findElement(By.id("wpRetype")).sendKeys("abc123");
		driver.findElement(By.id("wpEmail")).sendKeys("arifur@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("wpCreateaccount")).click();
		Thread.sleep(5000);

	}
	
//https://dl.bintray.com/testng-team/testng-eclipse-release/	
	
@Test(priority='2')
	public void MainPage() { 

		driver.findElement(By.linkText("Main page")).click();
		// to check if we have landed on the correct page or not
		System.out.println(driver.getTitle());
	}


//@AfterMethod this method will get executed after every test method
// so flow will be steup login logout------setup mainpage logout ----closebrowser
@AfterMethod 
public void logout() {
	
	System.out.println("logout of the application");
}
//@AfterClass annotation is giver that method which will be executed in the end

@AfterClass
public void closebrowser( ) {
	
	driver.close();
}










}
